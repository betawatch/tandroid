package ag;

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
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.m5;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.a5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.tp;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class k2 extends LinearLayout {
    public boolean D;
    public boolean E;
    public boolean F;
    public final p6 a;
    public final TextView b;
    public final TextView[] c;
    public final ImageView d;
    public final FrameLayout e;
    public final ViewGroup[] f;
    public final TextView[] h;
    public final TextView[][] n;
    public final tp r;
    public final FrameLayout s;
    public final LinearLayout w;
    public int x;
    public int y;

    public k2(Context context, p6 p6Var) {
        super(context);
        this.c = new TextView[2];
        this.f = new ViewGroup[7];
        this.h = new TextView[7];
        this.n = new TextView[7][];
        this.x = 1;
        this.y = 0;
        this.D = true;
        this.a = p6Var;
        setOrientation(1);
        setClipChildren(false);
        int i10 = 0;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            if (i10 == 0) {
                ViewGroup a5Var = new a5(context, 2);
                a5Var.setMinimumHeight(org.telegram.messenger.i0.L(60.0f));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setGravity(cd.X ? 5 : 3);
                textView.setTextSize(1, 16.0f);
                a5Var.addView(textView, b6.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i10] = new TextView(context);
                this.h[i10].setGravity(cd.X ? 5 : 3);
                this.h[i10].setTextSize(1, 13.0f);
                a7.V(this.h[i10], t6.z6, p6Var);
                a5Var.addView(this.h[i10], b6.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.w = linearLayout;
                linearLayout.setOrientation(1);
                this.s = new FrameLayout(context);
                this.n[i10] = new TextView[2];
                for (int i12 = 0; i12 < 2; i12++) {
                    this.n[i10][i12] = new TextView(context);
                    this.n[i10][i12].setTextSize(1, 14.0f);
                    a7.V(this.n[i10][i12], t6.z6, p6Var);
                    this.n[i10][i12].setGravity(cd.X ? 3 : 5);
                    this.s.addView(this.n[i10][i12], b6.i(-1.0f, -1.0f, zs.E1, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    this.c[i13] = new TextView(context);
                    this.c[i13].setTextSize(1, 14.0f);
                    a7.V(this.c[i13], t6.z6, p6Var);
                    this.c[i13].setGravity(cd.X ? 3 : 5);
                    this.s.addView(this.c[i13], b6.i(-1.0f, -1.0f, zs.E1, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                a7.t(imageView, t6.z6, p6Var, PorterDuff.Mode.SRC_IN);
                this.s.addView(imageView, b6.h(20.0f, 20.0f, 8388629));
                this.w.addView(this.s, new LinearLayout.LayoutParams(b6.z(-1.0f), b6.z(-1.0f), Gravity.getAbsoluteGravity(zs.E1, cd.X ? 1 : 0)));
                tp tpVar = new tp(context);
                this.r = tpVar;
                tpVar.getDrawable().L = true;
                tpVar.setTextSize(org.telegram.messenger.i0.L(13.0f));
                tpVar.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
                tpVar.setGravity(cd.X ? 3 : 5);
                int L = org.telegram.messenger.i0.L(8.0f);
                int i14 = t6.o6;
                int w02 = t6.w0(i14, p6Var);
                a(w02);
                int r12 = t6.r1(0.1f, w02);
                int w03 = t6.w0(i14, p6Var);
                a(w03);
                int r13 = t6.r1(0.22f, w03);
                tpVar.setBackground(t6.k0(L, L, L, L, r12, r13, r13));
                int w04 = t6.w0(i14, p6Var);
                a(w04);
                tpVar.setTextColor(w04);
                tpVar.getDrawable().A = 0.6f;
                tpVar.setVisibility(8);
                this.w.addView(tpVar, b6.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.w, b6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                a5Var.addView(frameLayout, b6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f[i10] = a5Var;
                addView(a5Var, b6.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup f7 = m5.f(context, 0);
                this.h[i10] = new TextView(context);
                this.h[i10].setTextSize(1, 14.0f);
                a7.V(this.h[i10], t6.G6, p6Var);
                this.h[i10].setGravity(cd.X ? 5 : 3);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.n[i10] = new TextView[2];
                for (int i15 = 0; i15 < 2; i15++) {
                    this.n[i10][i15] = new TextView(context);
                    this.n[i10][i15].setTextSize(1, 14.0f);
                    a7.V(this.n[i10][i15], t6.z6, p6Var);
                    this.n[i10][i15].setGravity(cd.X ? 3 : 5);
                    frameLayout2.addView(this.n[i10][i15], b6.e(-1, -1, zs.E1));
                }
                if (cd.X) {
                    f7.addView(frameLayout2, b6.r(-2, -1, 51));
                    f7.addView(this.h[i10], b6.r(-1, -1, 53));
                } else {
                    f7.addView(this.h[i10], b6.r(-2, -1, 51));
                    f7.addView(frameLayout2, b6.r(-1, -1, 53));
                }
                this.f[i10] = f7;
                addView(f7, b6.u(-1.0f, -2.0f, 51, 18.0f, i10 == 1 ? 1.0f : 11.66f, 28.0f, i10 == 6 ? 16.66f : 0.0f));
            }
            i10++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i10);

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
        int i10;
        int offset;
        boolean z14;
        TextView[][] textViewArr;
        boolean z15;
        float f7;
        ?? r42;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        int i12;
        boolean z16;
        int i13;
        int i14;
        float f10;
        ArrayList[] arrayListArr;
        int i15;
        boolean z17;
        ArrayList arrayList3;
        TextView[][] textViewArr2;
        int i16;
        int i17;
        int i18;
        boolean z18;
        ArrayList[] arrayListArr2;
        int i19;
        boolean z19;
        float f11;
        boolean z20 = z10;
        this.F = z20;
        this.E = z12;
        if (tL_businessWorkHours == null) {
            return;
        }
        boolean z21 = true;
        if (!tL_businessWorkHours.weekly_open.isEmpty()) {
            int i20 = 0;
            int i21 = 0;
            while (true) {
                if (i20 < tL_businessWorkHours.weekly_open.size()) {
                    TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = tL_businessWorkHours.weekly_open.get(i20);
                    if (tL_businessWeeklyOpen.start_minute > i21 + 1) {
                        break;
                    }
                    i21 = tL_businessWeeklyOpen.end_minute;
                    i20++;
                } else if (i21 >= 10079) {
                    z13 = true;
                }
            }
            if (z13) {
                this.F = false;
                z20 = false;
            }
            i10 = 8;
            int i22 = !z13 ? 8 : 0;
            ImageView imageView = this.d;
            imageView.setVisibility(i22);
            this.w.setTranslationX(!z13 ? org.telegram.messenger.i0.L(11.0f) : 0.0f);
            TLRPC.TL_timezone a2 = n3.b(d20.s0).a(tL_businessWorkHours.timezone_id);
            Calendar calendar = Calendar.getInstance();
            offset = ((calendar.getTimeZone().getOffset(System.currentTimeMillis()) / 1000) - (a2 != null ? 0 : a2.utc_offset)) / 60;
            if (offset != 0 && !z13) {
                i10 = 0;
            }
            tp tpVar = this.r;
            tpVar.setVisibility(i10);
            boolean z22 = offset != 0 ? false : z11;
            invalidate();
            z14 = this.D;
            TextView[] textViewArr3 = this.c;
            int i23 = 60;
            textViewArr = this.n;
            if (z14) {
                ViewPropertyAnimator duration = textViewArr3[0].animate().alpha((z20 || z22) ? 0.0f : 1.0f).setDuration(320L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                ViewPropertyAnimator animate = textViewArr3[1].animate();
                if (z20 || !z22) {
                    z15 = false;
                    f7 = 0.0f;
                } else {
                    z15 = false;
                    f7 = 1.0f;
                }
                animate.alpha(f7).setDuration(320L).setInterpolator(grVar).start();
                textViewArr[z15 ? 1 : 0][z15 ? 1 : 0].animate().alpha(z20 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(grVar).start();
                textViewArr[z15 ? 1 : 0][1].animate().alpha(z20 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(grVar).start();
                imageView.animate().rotation(z20 ? 180.0f : 0.0f).setDuration(320L).setInterpolator(grVar).start();
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
                                f11 = 1.0f;
                                if (this.D) {
                                    textViewArr4[r62].animate().alpha(f11).setDuration(320L).setInterpolator(gr.h).start();
                                } else {
                                    textViewArr4[r62].setAlpha(f11);
                                }
                                z21 = true;
                                r62++;
                            }
                        }
                        f11 = 0.0f;
                        if (this.D) {
                        }
                        z21 = true;
                        r62++;
                    }
                }
                z21 = true;
            }
            tpVar.c(cd.L0(!z22 ? 2131752730 : 2131752731, null), (!cd.X || this.D) ? z15 : true, true);
            this.D = z15;
            ArrayList[] d02 = h2.d0(new ArrayList(tL_businessWorkHours.weekly_open));
            int i24 = (calendar.get(7) + 5) % 7;
            int i25 = calendar.get(11);
            int i26 = calendar.get(12);
            arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
            arrayList2 = new ArrayList(arrayList.size());
            i11 = 0;
            boolean z23 = z13;
            while (i11 < arrayList.size()) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i11);
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen3 = new TL_account.TL_businessWeeklyOpen();
                boolean z24 = z20;
                if (offset != 0) {
                    int i27 = tL_businessWeeklyOpen2.start_minute;
                    boolean z25 = z23;
                    int i28 = i27 % 1440;
                    int i29 = tL_businessWeeklyOpen2.end_minute;
                    arrayListArr2 = d02;
                    int i30 = (i29 - i27) + i28;
                    z18 = z25;
                    if (i28 == 0) {
                        i19 = i26;
                        if (i30 != 1440) {
                            z19 = z25;
                        }
                        tL_businessWeeklyOpen3.start_minute = i27;
                        tL_businessWeeklyOpen3.end_minute = i29;
                        arrayList2.add(tL_businessWeeklyOpen3);
                        z19 = z25;
                        i11++;
                        z20 = z24;
                        z23 = z19;
                        i26 = i19;
                        d02 = arrayListArr2;
                    }
                } else {
                    z18 = z23;
                    arrayListArr2 = d02;
                }
                i19 = i26;
                z19 = z18;
                tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
                tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
                arrayList2.add(tL_businessWeeklyOpen3);
                int i31 = tL_businessWeeklyOpen3.start_minute;
                if (i31 < 0) {
                    int i32 = tL_businessWeeklyOpen3.end_minute;
                    if (i32 < 0) {
                        tL_businessWeeklyOpen3.start_minute = i31 + 10080;
                        tL_businessWeeklyOpen3.end_minute = i32 + 10080;
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
                    int i33 = tL_businessWeeklyOpen3.end_minute;
                    z19 = z19;
                    if (i33 > 10080) {
                        if (i31 > 10080) {
                            tL_businessWeeklyOpen3.start_minute = i31 - 10080;
                            tL_businessWeeklyOpen3.end_minute = i33 - 10080;
                            z19 = z19;
                        } else {
                            tL_businessWeeklyOpen3.end_minute = 10079;
                            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen5 = new TL_account.TL_businessWeeklyOpen();
                            tL_businessWeeklyOpen5.start_minute = 0;
                            tL_businessWeeklyOpen5.end_minute = (tL_businessWeeklyOpen2.end_minute + offset) - 10079;
                            arrayList2.add(tL_businessWeeklyOpen5);
                            i11++;
                            z20 = z24;
                            z23 = z19;
                            i26 = i19;
                            d02 = arrayListArr2;
                        }
                    }
                }
                i11++;
                z20 = z24;
                z23 = z19;
                i26 = i19;
                d02 = arrayListArr2;
            }
            boolean z26 = z20;
            boolean z27 = z23;
            ArrayList[] arrayListArr3 = d02;
            Collections.sort(arrayList2, new a4.d(1));
            int i34 = (i24 * 1440) + (i25 * 60) + i26;
            for (i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen6 = (TL_account.TL_businessWeeklyOpen) arrayList2.get(i12);
                int i35 = tL_businessWeeklyOpen6.start_minute;
                if ((i34 >= i35 && i34 <= tL_businessWeeklyOpen6.end_minute) || (((i17 = i34 + 10080) >= i35 && i17 <= tL_businessWeeklyOpen6.end_minute) || (i34 - 10080 >= i35 && i18 <= tL_businessWeeklyOpen6.end_minute))) {
                    z16 = true;
                    break;
                }
            }
            z16 = false;
            ArrayList[] d03 = h2.d0(arrayList2);
            String L0 = cd.L0(!z16 ? 2131752742 : 2131752743, null);
            TextView textView = this.b;
            textView.setText(L0);
            a7.V(textView, !z16 ? t6.l8 : t6.p7, this.a);
            int i36 = this.y;
            i13 = this.x;
            this.x = 1;
            this.y = 0;
            i14 = 0;
            while (i14 < 2) {
                ArrayList[] arrayListArr4 = i14 == 0 ? arrayListArr3 : d03;
                int i37 = 0;
                while (i37 < 7) {
                    int i38 = (i24 + i37) % 7;
                    TextView[] textViewArr5 = this.h;
                    if (i37 == 0) {
                        arrayListArr = d03;
                        textViewArr5[i37].setText(cd.L0(2131752746, null));
                        i15 = i14;
                        z17 = z16;
                    } else {
                        arrayListArr = d03;
                        i15 = i14;
                        String displayName = DayOfWeek.values()[i38].getDisplayName(TextStyle.FULL, cd.D0().y);
                        StringBuilder sb2 = new StringBuilder();
                        z17 = z16;
                        sb2.append(displayName.substring(0, 1).toUpperCase());
                        sb2.append(displayName.substring(1));
                        textViewArr5[i37].setText(sb2.toString());
                        textViewArr[i37][0].setVisibility(z26 ? 0 : 4);
                        textViewArr[i37][1].setVisibility(z26 ? 0 : 4);
                        textViewArr5[i37].setVisibility(z26 ? 0 : 4);
                    }
                    int i39 = 0;
                    while (true) {
                        if (i39 < (i37 == 0 ? 2 : 1)) {
                            TextView textView2 = i39 == 0 ? textViewArr[i37][i15] : textViewArr3[i15];
                            if (i37 == 0 && !z17 && i39 == 1) {
                                int i40 = 0;
                                while (true) {
                                    if (i40 >= arrayList2.size()) {
                                        i16 = -1;
                                        break;
                                    }
                                    i16 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(i40)).start_minute;
                                    if (i34 < i16) {
                                        break;
                                    } else {
                                        i40++;
                                    }
                                }
                                if (i16 == -1 && !arrayList2.isEmpty()) {
                                    i16 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(0)).start_minute;
                                }
                                if (i16 == -1) {
                                    textView2.setText(cd.L0(2131752745, null));
                                    arrayList3 = arrayList2;
                                    textViewArr2 = textViewArr;
                                } else {
                                    int i41 = i16 < i34 ? (10080 - i34) + i16 : i16 - i34;
                                    if (i41 < i23) {
                                        arrayList3 = arrayList2;
                                        textView2.setText(cd.G(i41, "BusinessHoursProfileOpensInMinutes", new Object[0]));
                                        textViewArr2 = textViewArr;
                                    } else {
                                        arrayList3 = arrayList2;
                                        if (i41 < 1440) {
                                            textViewArr2 = textViewArr;
                                            textView2.setText(cd.G((int) Math.ceil(i41 / 60.0f), "BusinessHoursProfileOpensInHours", new Object[0]));
                                        } else {
                                            textViewArr2 = textViewArr;
                                            textView2.setText(cd.G((int) Math.ceil((i41 / 60.0f) / 24.0f), "BusinessHoursProfileOpensInDays", new Object[0]));
                                        }
                                    }
                                }
                            } else {
                                arrayList3 = arrayList2;
                                textViewArr2 = textViewArr;
                                if (z27) {
                                    textView2.setText(cd.L0(2131752744, null));
                                } else if (arrayListArr4[i38].isEmpty()) {
                                    textView2.setText(cd.L0(2131752745, null));
                                } else if (h2.g0(arrayListArr4[i38])) {
                                    textView2.setText(cd.L0(2131752741, null));
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    for (int i42 = 0; i42 < arrayListArr4[i38].size(); i42++) {
                                        if (i42 > 0) {
                                            sb3.append("\n");
                                        }
                                        sb3.append(arrayListArr4[i38].get(i42));
                                    }
                                    int size = arrayListArr4[i38].size();
                                    textView2.setText(sb3);
                                    if (i37 == 0) {
                                        this.x = Math.max(this.x, size);
                                        this.y = Math.max(this.y, textView2.getLineHeight() * size);
                                    }
                                }
                            }
                            i39++;
                            arrayList2 = arrayList3;
                            textViewArr = textViewArr2;
                            i23 = 60;
                        }
                    }
                    i37++;
                    d03 = arrayListArr;
                    i14 = i15;
                    z16 = z17;
                    i23 = 60;
                }
                i14++;
                z16 = z16;
                i23 = 60;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
            f10 = 6.0f;
            layoutParams.topMargin = org.telegram.messenger.i0.L((this.x <= 2 || tpVar.getVisibility() == 0) ? 6.0f : 12.0f);
            if (this.x <= 2 && tpVar.getVisibility() != 0) {
                f10 = 12.0f;
            }
            layoutParams.bottomMargin = org.telegram.messenger.i0.L(f10);
            layoutParams.gravity = ((this.x <= 2 || tpVar.getVisibility() == 0) ? 16 : 80) | (!cd.X ? 3 : 5);
            if (i13 == this.x || i36 != this.y) {
                requestLayout();
            }
            return;
        }
        z13 = false;
        if (z13) {
        }
        i10 = 8;
        if (!z13) {
        }
        ImageView imageView2 = this.d;
        imageView2.setVisibility(i22);
        this.w.setTranslationX(!z13 ? org.telegram.messenger.i0.L(11.0f) : 0.0f);
        TLRPC.TL_timezone a22 = n3.b(d20.s0).a(tL_businessWorkHours.timezone_id);
        Calendar calendar2 = Calendar.getInstance();
        offset = ((calendar2.getTimeZone().getOffset(System.currentTimeMillis()) / 1000) - (a22 != null ? 0 : a22.utc_offset)) / 60;
        if (offset != 0) {
            i10 = 0;
        }
        tp tpVar2 = this.r;
        tpVar2.setVisibility(i10);
        if (offset != 0) {
        }
        invalidate();
        z14 = this.D;
        TextView[] textViewArr32 = this.c;
        int i232 = 60;
        textViewArr = this.n;
        if (z14) {
        }
        while (r42 < textViewArr.length) {
        }
        tpVar2.c(cd.L0(!z22 ? 2131752730 : 2131752731, null), (!cd.X || this.D) ? z15 : true, true);
        this.D = z15;
        ArrayList[] d022 = h2.d0(new ArrayList(tL_businessWorkHours.weekly_open));
        int i242 = (calendar2.get(7) + 5) % 7;
        int i252 = calendar2.get(11);
        int i262 = calendar2.get(12);
        arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
        arrayList2 = new ArrayList(arrayList.size());
        i11 = 0;
        boolean z232 = z13;
        while (i11 < arrayList.size()) {
        }
        boolean z262 = z20;
        boolean z272 = z232;
        ArrayList[] arrayListArr32 = d022;
        Collections.sort(arrayList2, new a4.d(1));
        int i342 = (i242 * 1440) + (i252 * 60) + i262;
        while (i12 < arrayList2.size()) {
        }
        z16 = false;
        ArrayList[] d032 = h2.d0(arrayList2);
        String L02 = cd.L0(!z16 ? 2131752742 : 2131752743, null);
        TextView textView3 = this.b;
        textView3.setText(L02);
        a7.V(textView3, !z16 ? t6.l8 : t6.p7, this.a);
        int i362 = this.y;
        i13 = this.x;
        this.x = 1;
        this.y = 0;
        i14 = 0;
        while (i14 < 2) {
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        f10 = 6.0f;
        layoutParams2.topMargin = org.telegram.messenger.i0.L((this.x <= 2 || tpVar2.getVisibility() == 0) ? 6.0f : 12.0f);
        if (this.x <= 2) {
            f10 = 12.0f;
        }
        layoutParams2.bottomMargin = org.telegram.messenger.i0.L(f10);
        layoutParams2.gravity = ((this.x <= 2 || tpVar2.getVisibility() == 0) ? 16 : 80) | (!cd.X ? 3 : 5);
        if (i13 == this.x) {
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E) {
            Paint W0 = t6.W0("paintDivider", this.a);
            if (W0 == null) {
                W0 = t6.k0;
            }
            canvas.drawRect(org.telegram.messenger.i0.L(cd.X ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - org.telegram.messenger.i0.L(cd.X ? 21.33f : 0.0f), getMeasuredHeight(), W0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        if (!this.F) {
            int L2 = org.telegram.messenger.i0.L(60.0f);
            int i12 = this.x;
            tp tpVar = this.r;
            if (i12 > 2 || tpVar.getVisibility() == 0) {
                L = org.telegram.messenger.i0.L(tpVar.getVisibility() == 0 ? 21.0f : 0.0f) + org.telegram.messenger.i0.L(15.0f) + this.y;
            } else {
                L = 0;
            }
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max(L2, L) + (this.E ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        tp tpVar = this.r;
        if (tpVar == null || tpVar.getVisibility() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        float x10 = motionEvent.getX();
        ViewGroup[] viewGroupArr = this.f;
        float x11 = x10 - viewGroupArr[0].getX();
        FrameLayout frameLayout = this.e;
        float x12 = x11 - frameLayout.getX();
        FrameLayout frameLayout2 = this.s;
        return tpVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - tpVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - tpVar.getY()));
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        tp tpVar = this.r;
        if (tpVar != null) {
            tpVar.setOnClickListener(onClickListener);
        }
    }
}
