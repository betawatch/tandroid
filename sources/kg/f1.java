package kg;

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
import c8.ha;
import di.a4;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class f1 extends LinearLayout {
    public boolean D;
    public boolean E;
    public boolean F;
    public final f6 a;
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

    public f1(Context context, f6 f6Var) {
        super(context);
        this.c = new TextView[2];
        this.f = new ViewGroup[7];
        this.h = new TextView[7];
        this.n = new TextView[7][];
        this.x = 1;
        this.y = 0;
        this.D = true;
        this.a = f6Var;
        setOrientation(1);
        setClipChildren(false);
        int i7 = 0;
        for (int i10 = 7; i7 < i10; i10 = 7) {
            if (i7 == 0) {
                ViewGroup a4Var = new a4(context, 4);
                a4Var.setMinimumHeight(org.telegram.messenger.g0.L(60.0f));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setGravity(hd.a0 ? 5 : 3);
                textView.setTextSize(1, 16.0f);
                a4Var.addView(textView, ha.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i7] = new TextView(context);
                this.h[i7].setGravity(hd.a0 ? 5 : 3);
                this.h[i7].setTextSize(1, 13.0f);
                r6.V(this.h[i7], k6.z6, f6Var);
                a4Var.addView(this.h[i7], ha.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.w = linearLayout;
                linearLayout.setOrientation(1);
                this.s = new FrameLayout(context);
                this.n[i7] = new TextView[2];
                for (int i11 = 0; i11 < 2; i11++) {
                    this.n[i7][i11] = new TextView(context);
                    this.n[i7][i11].setTextSize(1, 14.0f);
                    r6.V(this.n[i7][i11], k6.z6, f6Var);
                    this.n[i7][i11].setGravity(hd.a0 ? 3 : 5);
                    this.s.addView(this.n[i7][i11], ha.i(-1.0f, -1.0f, qs.E1, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    this.c[i12] = new TextView(context);
                    this.c[i12].setTextSize(1, 14.0f);
                    r6.V(this.c[i12], k6.z6, f6Var);
                    this.c[i12].setGravity(hd.a0 ? 3 : 5);
                    this.s.addView(this.c[i12], ha.i(-1.0f, -1.0f, qs.E1, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                r6.t(imageView, k6.z6, f6Var, PorterDuff.Mode.SRC_IN);
                this.s.addView(imageView, ha.h(20.0f, 20.0f, 8388629));
                this.w.addView(this.s, new LinearLayout.LayoutParams(ha.z(-1.0f), ha.z(-1.0f), Gravity.getAbsoluteGravity(qs.E1, hd.a0 ? 1 : 0)));
                mp mpVar = new mp(context);
                this.r = mpVar;
                mpVar.getDrawable().L = true;
                mpVar.setTextSize(org.telegram.messenger.g0.L(13.0f));
                mpVar.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                mpVar.setGravity(hd.a0 ? 3 : 5);
                int L = org.telegram.messenger.g0.L(8.0f);
                int i13 = k6.o6;
                int w02 = k6.w0(i13, f6Var);
                a(w02);
                int r12 = k6.r1(0.1f, w02);
                int w03 = k6.w0(i13, f6Var);
                a(w03);
                int r13 = k6.r1(0.22f, w03);
                mpVar.setBackground(k6.k0(L, L, L, L, r12, r13, r13));
                int w04 = k6.w0(i13, f6Var);
                a(w04);
                mpVar.setTextColor(w04);
                mpVar.getDrawable().A = 0.6f;
                mpVar.setVisibility(8);
                this.w.addView(mpVar, ha.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.w, ha.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                a4Var.addView(frameLayout, ha.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f[i7] = a4Var;
                addView(a4Var, ha.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup f10 = k5.f(context, 0);
                this.h[i7] = new TextView(context);
                this.h[i7].setTextSize(1, 14.0f);
                r6.V(this.h[i7], k6.G6, f6Var);
                this.h[i7].setGravity(hd.a0 ? 5 : 3);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.n[i7] = new TextView[2];
                for (int i14 = 0; i14 < 2; i14++) {
                    this.n[i7][i14] = new TextView(context);
                    this.n[i7][i14].setTextSize(1, 14.0f);
                    r6.V(this.n[i7][i14], k6.z6, f6Var);
                    this.n[i7][i14].setGravity(hd.a0 ? 3 : 5);
                    frameLayout2.addView(this.n[i7][i14], ha.e(-1, -1, qs.E1));
                }
                if (hd.a0) {
                    f10.addView(frameLayout2, ha.r(-2, -1, 51));
                    f10.addView(this.h[i7], ha.r(-1, -1, 53));
                } else {
                    f10.addView(this.h[i7], ha.r(-2, -1, 51));
                    f10.addView(frameLayout2, ha.r(-1, -1, 53));
                }
                this.f[i7] = f10;
                addView(f10, ha.u(-1.0f, -2.0f, 51, 18.0f, i7 == 1 ? 1.0f : 11.66f, 28.0f, i7 == 6 ? 16.66f : 0.0f));
            }
            i7++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i7);

    /* JADX WARN: Code restructure failed: missing block: B:80:0x022e, code lost:
    
        if (r4 == 1439) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02f7  */
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
    /* JADX WARN: Type inference failed for: r4v100 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [int] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29, types: [int] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_account.TL_businessWorkHours tL_businessWorkHours, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        int i7;
        int offset;
        boolean z13;
        TextView[][] textViewArr;
        boolean z14;
        float f10;
        ?? r42;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i10;
        int i11;
        boolean z15;
        int i12;
        int i13;
        float f11;
        ArrayList[] arrayListArr;
        boolean z16;
        ArrayList arrayList3;
        int i14;
        ArrayList[] arrayListArr2;
        int i15;
        int i16;
        int i17;
        boolean z17;
        ArrayList[] arrayListArr3;
        int i18;
        boolean z18;
        float f12;
        boolean z19 = z9;
        this.F = z19;
        this.E = z11;
        if (tL_businessWorkHours == null) {
            return;
        }
        boolean z20 = true;
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
                    z12 = true;
                }
            }
            if (z12) {
                this.F = false;
                z19 = false;
            }
            i7 = 8;
            int i21 = !z12 ? 8 : 0;
            ImageView imageView = this.d;
            imageView.setVisibility(i21);
            this.w.setTranslationX(!z12 ? org.telegram.messenger.g0.L(11.0f) : 0.0f);
            TLRPC.TL_timezone a10 = x1.b(p10.s0).a(tL_businessWorkHours.timezone_id);
            Calendar calendar = Calendar.getInstance();
            offset = ((calendar.getTimeZone().getOffset(System.currentTimeMillis()) / 1000) - (a10 != null ? 0 : a10.utc_offset)) / 60;
            if (offset != 0 && !z12) {
                i7 = 0;
            }
            mp mpVar = this.r;
            mpVar.setVisibility(i7);
            boolean z21 = offset != 0 ? false : z10;
            invalidate();
            z13 = this.D;
            TextView[] textViewArr2 = this.c;
            int i22 = 60;
            textViewArr = this.n;
            if (z13) {
                ViewPropertyAnimator duration = textViewArr2[0].animate().alpha((z19 || z21) ? 0.0f : 1.0f).setDuration(320L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                ViewPropertyAnimator animate = textViewArr2[1].animate();
                if (z19 || !z21) {
                    z14 = false;
                    f10 = 0.0f;
                } else {
                    z14 = false;
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(320L).setInterpolator(xqVar).start();
                textViewArr[z14 ? 1 : 0][z14 ? 1 : 0].animate().alpha(z19 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(xqVar).start();
                textViewArr[z14 ? 1 : 0][1].animate().alpha(z19 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(xqVar).start();
                imageView.animate().rotation(z19 ? 180.0f : 0.0f).setDuration(320L).setInterpolator(xqVar).start();
            } else {
                textViewArr2[0].setAlpha((z19 || z21) ? 0.0f : 1.0f);
                textViewArr2[1].setAlpha((z19 || !z21) ? 0.0f : 1.0f);
                imageView.setRotation(z19 ? 180.0f : 0.0f);
                z14 = false;
            }
            for (r42 = z14; r42 < textViewArr.length; r42++) {
                ?? r62 = z14;
                while (true) {
                    TextView[] textViewArr3 = textViewArr[r42];
                    if (r62 < textViewArr3.length) {
                        if (r42 != 0 || z19) {
                            if ((r62 == z20 ? z20 : z14) == z21) {
                                f12 = 1.0f;
                                if (this.D) {
                                    textViewArr3[r62].animate().alpha(f12).setDuration(320L).setInterpolator(xq.h).start();
                                } else {
                                    textViewArr3[r62].setAlpha(f12);
                                }
                                z20 = true;
                                r62++;
                            }
                        }
                        f12 = 0.0f;
                        if (this.D) {
                        }
                        z20 = true;
                        r62++;
                    }
                }
                z20 = true;
            }
            mpVar.c(hd.M0(!z21 ? 2131752730 : 2131752731, null), (!hd.a0 || this.D) ? z14 : true, true);
            this.D = z14;
            ArrayList[] e02 = c1.e0(new ArrayList(tL_businessWorkHours.weekly_open));
            int i23 = (calendar.get(7) + 5) % 7;
            int i24 = calendar.get(11);
            int i25 = calendar.get(12);
            arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
            arrayList2 = new ArrayList(arrayList.size());
            i10 = 0;
            boolean z22 = z12;
            while (i10 < arrayList.size()) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i10);
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen3 = new TL_account.TL_businessWeeklyOpen();
                boolean z23 = z19;
                if (offset != 0) {
                    int i26 = tL_businessWeeklyOpen2.start_minute;
                    boolean z24 = z22;
                    int i27 = i26 % 1440;
                    int i28 = tL_businessWeeklyOpen2.end_minute;
                    arrayListArr3 = e02;
                    int i29 = (i28 - i26) + i27;
                    z17 = z24;
                    if (i27 == 0) {
                        i18 = i25;
                        if (i29 != 1440) {
                            z18 = z24;
                        }
                        tL_businessWeeklyOpen3.start_minute = i26;
                        tL_businessWeeklyOpen3.end_minute = i28;
                        arrayList2.add(tL_businessWeeklyOpen3);
                        z18 = z24;
                        i10++;
                        z19 = z23;
                        z22 = z18;
                        i25 = i18;
                        e02 = arrayListArr3;
                    }
                } else {
                    z17 = z22;
                    arrayListArr3 = e02;
                }
                i18 = i25;
                z18 = z17;
                tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
                tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
                arrayList2.add(tL_businessWeeklyOpen3);
                int i30 = tL_businessWeeklyOpen3.start_minute;
                if (i30 < 0) {
                    int i31 = tL_businessWeeklyOpen3.end_minute;
                    if (i31 < 0) {
                        tL_businessWeeklyOpen3.start_minute = i30 + 10080;
                        tL_businessWeeklyOpen3.end_minute = i31 + 10080;
                        z18 = z18;
                    } else {
                        tL_businessWeeklyOpen3.start_minute = 0;
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen4 = new TL_account.TL_businessWeeklyOpen();
                        tL_businessWeeklyOpen4.start_minute = tL_businessWeeklyOpen2.start_minute + 10080 + offset;
                        tL_businessWeeklyOpen4.end_minute = 10079;
                        arrayList2.add(tL_businessWeeklyOpen4);
                        z18 = z18;
                    }
                } else {
                    int i32 = tL_businessWeeklyOpen3.end_minute;
                    z18 = z18;
                    if (i32 > 10080) {
                        if (i30 > 10080) {
                            tL_businessWeeklyOpen3.start_minute = i30 - 10080;
                            tL_businessWeeklyOpen3.end_minute = i32 - 10080;
                            z18 = z18;
                        } else {
                            tL_businessWeeklyOpen3.end_minute = 10079;
                            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen5 = new TL_account.TL_businessWeeklyOpen();
                            tL_businessWeeklyOpen5.start_minute = 0;
                            tL_businessWeeklyOpen5.end_minute = (tL_businessWeeklyOpen2.end_minute + offset) - 10079;
                            arrayList2.add(tL_businessWeeklyOpen5);
                            i10++;
                            z19 = z23;
                            z22 = z18;
                            i25 = i18;
                            e02 = arrayListArr3;
                        }
                    }
                }
                i10++;
                z19 = z23;
                z22 = z18;
                i25 = i18;
                e02 = arrayListArr3;
            }
            boolean z25 = z19;
            boolean z26 = z22;
            ArrayList[] arrayListArr4 = e02;
            Collections.sort(arrayList2, new jg.x(3));
            int i33 = (i23 * 1440) + (i24 * 60) + i25;
            for (i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen6 = (TL_account.TL_businessWeeklyOpen) arrayList2.get(i11);
                int i34 = tL_businessWeeklyOpen6.start_minute;
                if ((i33 >= i34 && i33 <= tL_businessWeeklyOpen6.end_minute) || (((i16 = i33 + 10080) >= i34 && i16 <= tL_businessWeeklyOpen6.end_minute) || (i33 - 10080 >= i34 && i17 <= tL_businessWeeklyOpen6.end_minute))) {
                    z15 = true;
                    break;
                }
            }
            z15 = false;
            ArrayList[] e03 = c1.e0(arrayList2);
            String M0 = hd.M0(!z15 ? 2131752742 : 2131752743, null);
            TextView textView = this.b;
            textView.setText(M0);
            r6.V(textView, !z15 ? k6.l8 : k6.p7, this.a);
            int i35 = this.y;
            i12 = this.x;
            this.x = 1;
            this.y = 0;
            i13 = 0;
            while (i13 < 2) {
                ArrayList[] arrayListArr5 = i13 == 0 ? arrayListArr4 : e03;
                int i36 = 0;
                while (i36 < 7) {
                    int i37 = (i23 + i36) % 7;
                    TextView[] textViewArr4 = this.h;
                    if (i36 == 0) {
                        arrayListArr = e03;
                        textViewArr4[i36].setText(hd.M0(2131752746, null));
                        z16 = z15;
                    } else {
                        arrayListArr = e03;
                        String displayName = DayOfWeek.values()[i37].getDisplayName(TextStyle.FULL, hd.E0().y);
                        StringBuilder sb2 = new StringBuilder();
                        z16 = z15;
                        sb2.append(displayName.substring(0, 1).toUpperCase());
                        sb2.append(displayName.substring(1));
                        textViewArr4[i36].setText(sb2.toString());
                        textViewArr[i36][0].setVisibility(z25 ? 0 : 4);
                        textViewArr[i36][1].setVisibility(z25 ? 0 : 4);
                        textViewArr4[i36].setVisibility(z25 ? 0 : 4);
                    }
                    int i38 = 0;
                    while (true) {
                        if (i38 < (i36 == 0 ? 2 : 1)) {
                            TextView textView2 = i38 == 0 ? textViewArr[i36][i13] : textViewArr2[i13];
                            if (i36 == 0 && !z16 && i38 == 1) {
                                int i39 = 0;
                                while (true) {
                                    i14 = i38;
                                    if (i39 >= arrayList2.size()) {
                                        i15 = -1;
                                        break;
                                    }
                                    i15 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(i39)).start_minute;
                                    if (i33 < i15) {
                                        break;
                                    }
                                    i39++;
                                    i38 = i14;
                                }
                                if (i15 == -1 && !arrayList2.isEmpty()) {
                                    i15 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(0)).start_minute;
                                }
                                if (i15 == -1) {
                                    textView2.setText(hd.M0(2131752745, null));
                                    arrayList3 = arrayList2;
                                    arrayListArr2 = arrayListArr5;
                                } else {
                                    int i40 = i15 < i33 ? (10080 - i33) + i15 : i15 - i33;
                                    if (i40 < i22) {
                                        arrayList3 = arrayList2;
                                        textView2.setText(hd.G(i40, "BusinessHoursProfileOpensInMinutes", new Object[0]));
                                        arrayListArr2 = arrayListArr5;
                                    } else {
                                        arrayList3 = arrayList2;
                                        if (i40 < 1440) {
                                            arrayListArr2 = arrayListArr5;
                                            textView2.setText(hd.G((int) Math.ceil(i40 / 60.0f), "BusinessHoursProfileOpensInHours", new Object[0]));
                                        } else {
                                            arrayListArr2 = arrayListArr5;
                                            textView2.setText(hd.G((int) Math.ceil((i40 / 60.0f) / 24.0f), "BusinessHoursProfileOpensInDays", new Object[0]));
                                        }
                                    }
                                }
                            } else {
                                arrayList3 = arrayList2;
                                i14 = i38;
                                arrayListArr2 = arrayListArr5;
                                if (z26) {
                                    textView2.setText(hd.M0(2131752744, null));
                                } else if (arrayListArr2[i37].isEmpty()) {
                                    textView2.setText(hd.M0(2131752745, null));
                                } else if (c1.h0(arrayListArr2[i37])) {
                                    textView2.setText(hd.M0(2131752741, null));
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i41 = 0; i41 < arrayListArr2[i37].size(); i41++) {
                                        if (i41 > 0) {
                                            sb3.append("\n");
                                        }
                                        sb3.append(arrayListArr2[i37].get(i41));
                                    }
                                    int size = arrayListArr2[i37].size();
                                    textView2.setText(sb3);
                                    if (i36 == 0) {
                                        this.x = Math.max(this.x, size);
                                        this.y = Math.max(this.y, textView2.getLineHeight() * size);
                                    }
                                }
                            }
                            arrayListArr5 = arrayListArr2;
                            i38 = i14 + 1;
                            arrayList2 = arrayList3;
                            i22 = 60;
                        }
                    }
                    i36++;
                    e03 = arrayListArr;
                    z15 = z16;
                    i22 = 60;
                }
                i13++;
                e03 = e03;
                i22 = 60;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
            f11 = 6.0f;
            layoutParams.topMargin = org.telegram.messenger.g0.L((this.x <= 2 || mpVar.getVisibility() == 0) ? 6.0f : 12.0f);
            if (this.x <= 2 && mpVar.getVisibility() != 0) {
                f11 = 12.0f;
            }
            layoutParams.bottomMargin = org.telegram.messenger.g0.L(f11);
            layoutParams.gravity = ((this.x <= 2 || mpVar.getVisibility() == 0) ? 16 : 80) | (!hd.a0 ? 3 : 5);
            if (i12 == this.x || i35 != this.y) {
                requestLayout();
            }
            return;
        }
        z12 = false;
        if (z12) {
        }
        i7 = 8;
        if (!z12) {
        }
        ImageView imageView2 = this.d;
        imageView2.setVisibility(i21);
        this.w.setTranslationX(!z12 ? org.telegram.messenger.g0.L(11.0f) : 0.0f);
        TLRPC.TL_timezone a102 = x1.b(p10.s0).a(tL_businessWorkHours.timezone_id);
        Calendar calendar2 = Calendar.getInstance();
        offset = ((calendar2.getTimeZone().getOffset(System.currentTimeMillis()) / 1000) - (a102 != null ? 0 : a102.utc_offset)) / 60;
        if (offset != 0) {
            i7 = 0;
        }
        mp mpVar2 = this.r;
        mpVar2.setVisibility(i7);
        if (offset != 0) {
        }
        invalidate();
        z13 = this.D;
        TextView[] textViewArr22 = this.c;
        int i222 = 60;
        textViewArr = this.n;
        if (z13) {
        }
        while (r42 < textViewArr.length) {
        }
        mpVar2.c(hd.M0(!z21 ? 2131752730 : 2131752731, null), (!hd.a0 || this.D) ? z14 : true, true);
        this.D = z14;
        ArrayList[] e022 = c1.e0(new ArrayList(tL_businessWorkHours.weekly_open));
        int i232 = (calendar2.get(7) + 5) % 7;
        int i242 = calendar2.get(11);
        int i252 = calendar2.get(12);
        arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
        arrayList2 = new ArrayList(arrayList.size());
        i10 = 0;
        boolean z222 = z12;
        while (i10 < arrayList.size()) {
        }
        boolean z252 = z19;
        boolean z262 = z222;
        ArrayList[] arrayListArr42 = e022;
        Collections.sort(arrayList2, new jg.x(3));
        int i332 = (i232 * 1440) + (i242 * 60) + i252;
        while (i11 < arrayList2.size()) {
        }
        z15 = false;
        ArrayList[] e032 = c1.e0(arrayList2);
        String M02 = hd.M0(!z15 ? 2131752742 : 2131752743, null);
        TextView textView3 = this.b;
        textView3.setText(M02);
        r6.V(textView3, !z15 ? k6.l8 : k6.p7, this.a);
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
        layoutParams2.gravity = ((this.x <= 2 || mpVar2.getVisibility() == 0) ? 16 : 80) | (!hd.a0 ? 3 : 5);
        if (i12 == this.x) {
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            Paint W0 = k6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = k6.k0;
            }
            canvas.drawRect(org.telegram.messenger.g0.L(hd.a0 ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.g0.L(hd.a0 ? 21.33f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
        if (!this.F) {
            int L2 = org.telegram.messenger.g0.L(60.0f);
            int i11 = this.x;
            mp mpVar = this.r;
            if (i11 > 2 || mpVar.getVisibility() == 0) {
                L = org.telegram.messenger.g0.L(mpVar.getVisibility() == 0 ? 21.0f : 0.0f) + org.telegram.messenger.g0.L(15.0f) + this.y;
            } else {
                L = 0;
            }
            i10 = View.MeasureSpec.makeMeasureSpec(Math.max(L2, L) + (this.E ? 1 : 0), TLObject.FLAG_30);
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
