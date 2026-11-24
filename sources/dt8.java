// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class dt8 extends LinearLayout {
    public boolean E;
    public boolean F;
    public boolean G;
    public final ylb a;
    public final TextView b;
    public final TextView[] c;
    public final ImageView d;
    public final FrameLayout e;
    public final ViewGroup[] f;
    public final TextView[] h;
    public final TextView[][] n;
    public final wj2 r;
    public final FrameLayout s;
    public final LinearLayout w;
    public int x;
    public int y;

    public dt8(Context context, ylb ylbVar) {
        super(context);
        this.c = new TextView[2];
        this.f = new ViewGroup[7];
        this.h = new TextView[7];
        this.n = new TextView[7][];
        this.x = 1;
        byte b = 0;
        this.y = 0;
        this.E = true;
        this.a = ylbVar;
        setOrientation(1);
        setClipChildren(false);
        int i = 0;
        for (int i2 = 7; i < i2; i2 = 7) {
            if (i == 0) {
                ViewGroup ct8Var = new ct8(context, b);
                ct8Var.setMinimumHeight(gm.L(60.0f));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setGravity(jb6.a0 ? 5 : 3);
                textView.setTextSize(1, 16.0f);
                ct8Var.addView(textView, qoe.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i] = new TextView(context);
                this.h[i].setGravity(jb6.a0 ? 5 : 3);
                this.h[i].setTextSize(1, 13.0f);
                anb.X(this.h[i], cmb.y6, ylbVar);
                ct8Var.addView(this.h[i], qoe.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.w = linearLayout;
                linearLayout.setOrientation(1);
                this.s = new FrameLayout(context);
                this.n[i] = new TextView[2];
                for (int i3 = 0; i3 < 2; i3++) {
                    this.n[i][i3] = new TextView(context);
                    this.n[i][i3].setTextSize(1, 14.0f);
                    anb.X(this.n[i][i3], cmb.y6, ylbVar);
                    this.n[i][i3].setGravity(jb6.a0 ? 3 : 5);
                    this.s.addView(this.n[i][i3], qoe.i(-1.0f, -1.0f, nm7.D1, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i4 = 0; i4 < 2; i4++) {
                    this.c[i4] = new TextView(context);
                    this.c[i4].setTextSize(1, 14.0f);
                    anb.X(this.c[i4], cmb.y6, ylbVar);
                    this.c[i4].setGravity(jb6.a0 ? 3 : 5);
                    this.s.addView(this.c[i4], qoe.i(-1.0f, -1.0f, nm7.D1, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                anb.s(imageView, cmb.y6, ylbVar, PorterDuff.Mode.SRC_IN);
                this.s.addView(imageView, qoe.h(20.0f, 20.0f, 8388629));
                this.w.addView(this.s, new LinearLayout.LayoutParams(qoe.z(-1.0f), qoe.z(-1.0f), Gravity.getAbsoluteGravity(nm7.D1, jb6.a0 ? 1 : 0)));
                wj2 wj2Var = new wj2(context);
                this.r = wj2Var;
                wj2Var.getDrawable().M = true;
                wj2Var.setTextSize(gm.L(13.0f));
                wj2Var.setPadding(gm.L(6.0f), 0, gm.L(6.0f), 0);
                wj2Var.setGravity(jb6.a0 ? 3 : 5);
                int L = gm.L(8.0f);
                int i5 = cmb.n6;
                int v0 = cmb.v0(i5, ylbVar);
                RectF rectF = ProfileActivity.e7;
                int p1 = cmb.p1(0.1f, v0);
                int p12 = cmb.p1(0.22f, cmb.v0(i5, ylbVar));
                wj2Var.setBackground(cmb.i0(L, L, L, L, p1, p12, p12));
                wj2Var.setTextColor(cmb.v0(i5, ylbVar));
                wj2Var.getDrawable().B = 0.6f;
                wj2Var.setVisibility(8);
                this.w.addView(wj2Var, qoe.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.w, qoe.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                ct8Var.addView(frameLayout, qoe.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f[i] = ct8Var;
                addView(ct8Var, qoe.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup i6 = hg9.i(context, 0);
                this.h[i] = new TextView(context);
                this.h[i].setTextSize(1, 14.0f);
                anb.X(this.h[i], cmb.F6, ylbVar);
                this.h[i].setGravity(jb6.a0 ? 5 : 3);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.n[i] = new TextView[2];
                for (int i7 = 0; i7 < 2; i7++) {
                    this.n[i][i7] = new TextView(context);
                    this.n[i][i7].setTextSize(1, 14.0f);
                    anb.X(this.n[i][i7], cmb.y6, ylbVar);
                    this.n[i][i7].setGravity(jb6.a0 ? 3 : 5);
                    frameLayout2.addView(this.n[i][i7], qoe.e(-1, -1, nm7.D1));
                }
                if (jb6.a0) {
                    i6.addView(frameLayout2, qoe.r(-2, -1, 51));
                    i6.addView(this.h[i], qoe.r(-1, -1, 53));
                } else {
                    i6.addView(this.h[i], qoe.r(-2, -1, 51));
                    i6.addView(frameLayout2, qoe.r(-1, -1, 53));
                }
                this.f[i] = i6;
                addView(i6, qoe.u(-1.0f, -2.0f, 51, 18.0f, i == 1 ? 1.0f : 11.66f, 28.0f, i == 6 ? 16.66f : 0.0f));
            }
            i++;
        }
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0229, code lost:
    
        if (r4 == 1439) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0186  */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28, types: [int] */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50, types: [int] */
    /* JADX WARN: Type inference failed for: r6v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(TL_account.TL_businessWorkHours tL_businessWorkHours, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i;
        boolean z5;
        float f;
        boolean z6;
        ArrayList[] arrayListArr;
        int i2;
        boolean z7;
        ArrayList arrayList;
        TextView[][] textViewArr;
        int i3;
        int i4;
        int i5;
        boolean z8;
        ArrayList[] arrayListArr2;
        int i6;
        boolean z9;
        float f2;
        boolean z10 = z;
        this.G = z10;
        this.F = z3;
        if (tL_businessWorkHours != null) {
            boolean z11 = true;
            if (!tL_businessWorkHours.weekly_open.isEmpty()) {
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    if (i7 < tL_businessWorkHours.weekly_open.size()) {
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = tL_businessWorkHours.weekly_open.get(i7);
                        if (tL_businessWeeklyOpen.start_minute > i8 + 1) {
                            break;
                        }
                        i8 = tL_businessWeeklyOpen.end_minute;
                        i7++;
                    } else if (i8 >= 10079) {
                        z4 = true;
                    }
                }
            }
            z4 = false;
            int i9 = 8;
            if (z4) {
                this.G = false;
                z10 = false;
                i = 8;
            } else {
                i = 0;
            }
            ImageView imageView = this.d;
            imageView.setVisibility(i);
            this.w.setTranslationX(z4 ? gm.L(11.0f) : 0.0f);
            TLRPC.TL_timezone a = xqb.b(z8c.t0).a(tL_businessWorkHours.timezone_id);
            Calendar calendar = Calendar.getInstance();
            int offset = ((calendar.getTimeZone().getOffset(System.currentTimeMillis()) / 1000) - (a == null ? 0 : a.utc_offset)) / 60;
            if (offset != 0 && !z4) {
                i9 = 0;
            }
            wj2 wj2Var = this.r;
            wj2Var.setVisibility(i9);
            boolean z12 = offset == 0 ? false : z2;
            invalidate();
            boolean z13 = this.E;
            TextView[] textViewArr2 = this.c;
            int i10 = 60;
            TextView[][] textViewArr3 = this.n;
            if (z13) {
                textViewArr2[0].setAlpha((z10 || z12) ? 0.0f : 1.0f);
                textViewArr2[1].setAlpha((z10 || !z12) ? 0.0f : 1.0f);
                imageView.setRotation(z10 ? 180.0f : 0.0f);
                z5 = false;
            } else {
                ViewPropertyAnimator duration = textViewArr2[0].animate().alpha((z10 || z12) ? 0.0f : 1.0f).setDuration(320L);
                d53 d53Var = d53.h;
                duration.setInterpolator(d53Var).start();
                ViewPropertyAnimator animate = textViewArr2[1].animate();
                if (z10 || !z12) {
                    z5 = false;
                    f = 0.0f;
                } else {
                    z5 = false;
                    f = 1.0f;
                }
                animate.alpha(f).setDuration(320L).setInterpolator(d53Var).start();
                textViewArr3[z5 ? 1 : 0][z5 ? 1 : 0].animate().alpha(z10 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(d53Var).start();
                textViewArr3[z5 ? 1 : 0][1].animate().alpha(z10 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(d53Var).start();
                imageView.animate().rotation(z10 ? 180.0f : 0.0f).setDuration(320L).setInterpolator(d53Var).start();
            }
            for (?? r4 = z5; r4 < textViewArr3.length; r4++) {
                ?? r6 = z5;
                while (true) {
                    TextView[] textViewArr4 = textViewArr3[r4];
                    if (r6 < textViewArr4.length) {
                        if (r4 != 0 || z10) {
                            if ((r6 == z11 ? z11 : z5) == z12) {
                                f2 = 1.0f;
                                if (this.E) {
                                    textViewArr4[r6].animate().alpha(f2).setDuration(320L).setInterpolator(d53.h).start();
                                } else {
                                    textViewArr4[r6].setAlpha(f2);
                                }
                                z11 = true;
                                r6++;
                            }
                        }
                        f2 = 0.0f;
                        if (this.E) {
                        }
                        z11 = true;
                        r6++;
                    }
                }
                z11 = true;
            }
            wj2Var.c(jb6.M0(z12 ? 2131752683 : 2131752684, null), (jb6.a0 || this.E) ? z5 : true, true);
            this.E = z5;
            ArrayList[] c0 = ss7.c0(new ArrayList(tL_businessWorkHours.weekly_open));
            int i11 = (calendar.get(7) + 5) % 7;
            int i12 = calendar.get(11);
            int i13 = calendar.get(12);
            ArrayList arrayList2 = new ArrayList(tL_businessWorkHours.weekly_open);
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int i14 = 0;
            boolean z14 = z4;
            while (i14 < arrayList2.size()) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList2.get(i14);
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen3 = new TL_account.TL_businessWeeklyOpen();
                boolean z15 = z10;
                if (offset != 0) {
                    int i15 = tL_businessWeeklyOpen2.start_minute;
                    z9 = z14;
                    int i16 = i15 % 1440;
                    int i17 = tL_businessWeeklyOpen2.end_minute;
                    arrayListArr2 = c0;
                    int i18 = (i17 - i15) + i16;
                    z8 = z9;
                    if (i16 == 0) {
                        i6 = i13;
                        if (i18 != 1440) {
                            z9 = z9;
                        }
                        tL_businessWeeklyOpen3.start_minute = i15;
                        tL_businessWeeklyOpen3.end_minute = i17;
                        arrayList3.add(tL_businessWeeklyOpen3);
                        i14++;
                        z10 = z15;
                        z14 = z9;
                        i13 = i6;
                        c0 = arrayListArr2;
                    }
                } else {
                    z8 = z14;
                    arrayListArr2 = c0;
                }
                i6 = i13;
                z9 = z8;
                tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
                tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
                arrayList3.add(tL_businessWeeklyOpen3);
                int i19 = tL_businessWeeklyOpen3.start_minute;
                int i20 = tL_businessWeeklyOpen3.end_minute;
                if (i19 < 0) {
                    if (i20 < 0) {
                        tL_businessWeeklyOpen3.start_minute = i19 + 10080;
                        tL_businessWeeklyOpen3.end_minute = i20 + 10080;
                    } else {
                        tL_businessWeeklyOpen3.start_minute = 0;
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen4 = new TL_account.TL_businessWeeklyOpen();
                        tL_businessWeeklyOpen4.start_minute = tL_businessWeeklyOpen2.start_minute + 10080 + offset;
                        tL_businessWeeklyOpen4.end_minute = 10079;
                        arrayList3.add(tL_businessWeeklyOpen4);
                    }
                } else if (i20 > 10080) {
                    if (i19 > 10080) {
                        tL_businessWeeklyOpen3.start_minute = i19 - 10080;
                        tL_businessWeeklyOpen3.end_minute = i20 - 10080;
                    } else {
                        tL_businessWeeklyOpen3.end_minute = 10079;
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen5 = new TL_account.TL_businessWeeklyOpen();
                        tL_businessWeeklyOpen5.start_minute = 0;
                        tL_businessWeeklyOpen5.end_minute = (tL_businessWeeklyOpen2.end_minute + offset) - 10079;
                        arrayList3.add(tL_businessWeeklyOpen5);
                    }
                }
                i14++;
                z10 = z15;
                z14 = z9;
                i13 = i6;
                c0 = arrayListArr2;
            }
            boolean z16 = z10;
            boolean z17 = z14;
            ArrayList[] arrayListArr3 = c0;
            Collections.sort(arrayList3, new tk6((byte) 29));
            int i21 = (i11 * 1440) + (i12 * 60) + i13;
            for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen6 = (TL_account.TL_businessWeeklyOpen) arrayList3.get(i22);
                int i23 = tL_businessWeeklyOpen6.start_minute;
                if ((i21 >= i23 && i21 <= tL_businessWeeklyOpen6.end_minute) || (((i4 = i21 + 10080) >= i23 && i4 <= tL_businessWeeklyOpen6.end_minute) || (i21 - 10080 >= i23 && i5 <= tL_businessWeeklyOpen6.end_minute))) {
                    z6 = true;
                    break;
                }
            }
            z6 = false;
            ArrayList[] c02 = ss7.c0(arrayList3);
            String M0 = jb6.M0(z6 ? 2131752695 : 2131752696, null);
            TextView textView = this.b;
            textView.setText(M0);
            anb.X(textView, z6 ? cmb.k8 : cmb.o7, this.a);
            int i24 = this.y;
            int i25 = this.x;
            this.x = 1;
            this.y = 0;
            int i26 = 0;
            while (i26 < 2) {
                ArrayList[] arrayListArr4 = i26 == 0 ? arrayListArr3 : c02;
                int i27 = 0;
                while (i27 < 7) {
                    int i28 = (i11 + i27) % 7;
                    TextView[] textViewArr5 = this.h;
                    if (i27 == 0) {
                        arrayListArr = c02;
                        textViewArr5[i27].setText(jb6.M0(2131752699, null));
                        i2 = i26;
                        z7 = z6;
                    } else {
                        arrayListArr = c02;
                        i2 = i26;
                        String displayName = DayOfWeek.values()[i28].getDisplayName(TextStyle.FULL, jb6.D0().y);
                        StringBuilder sb = new StringBuilder();
                        z7 = z6;
                        sb.append(displayName.substring(0, 1).toUpperCase());
                        sb.append(displayName.substring(1));
                        textViewArr5[i27].setText(sb.toString());
                        textViewArr3[i27][0].setVisibility(z16 ? 0 : 4);
                        textViewArr3[i27][1].setVisibility(z16 ? 0 : 4);
                        textViewArr5[i27].setVisibility(z16 ? 0 : 4);
                    }
                    int i29 = 0;
                    while (true) {
                        if (i29 < (i27 == 0 ? 2 : 1)) {
                            TextView textView2 = i29 == 0 ? textViewArr3[i27][i2] : textViewArr2[i2];
                            if (i27 == 0 && !z7 && i29 == 1) {
                                int i30 = 0;
                                while (true) {
                                    if (i30 >= arrayList3.size()) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 = ((TL_account.TL_businessWeeklyOpen) arrayList3.get(i30)).start_minute;
                                    if (i21 < i3) {
                                        break;
                                    } else {
                                        i30++;
                                    }
                                }
                                if (i3 == -1 && !arrayList3.isEmpty()) {
                                    i3 = ((TL_account.TL_businessWeeklyOpen) arrayList3.get(0)).start_minute;
                                }
                                if (i3 == -1) {
                                    textView2.setText(jb6.M0(2131752698, null));
                                    arrayList = arrayList3;
                                } else {
                                    int i31 = i3 < i21 ? (10080 - i21) + i3 : i3 - i21;
                                    if (i31 < i10) {
                                        arrayList = arrayList3;
                                        textView2.setText(jb6.G(i31, "BusinessHoursProfileOpensInMinutes", new Object[0]));
                                    } else {
                                        arrayList = arrayList3;
                                        if (i31 < 1440) {
                                            textViewArr = textViewArr3;
                                            textView2.setText(jb6.G((int) Math.ceil(i31 / 60.0f), "BusinessHoursProfileOpensInHours", new Object[0]));
                                        } else {
                                            textViewArr = textViewArr3;
                                            textView2.setText(jb6.G((int) Math.ceil((i31 / 60.0f) / 24.0f), "BusinessHoursProfileOpensInDays", new Object[0]));
                                        }
                                    }
                                }
                                textViewArr = textViewArr3;
                            } else {
                                arrayList = arrayList3;
                                textViewArr = textViewArr3;
                                if (z17) {
                                    textView2.setText(jb6.M0(2131752697, null));
                                } else if (arrayListArr4[i28].isEmpty()) {
                                    textView2.setText(jb6.M0(2131752698, null));
                                } else if (ss7.f0(arrayListArr4[i28])) {
                                    textView2.setText(jb6.M0(2131752694, null));
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i32 = 0; i32 < arrayListArr4[i28].size(); i32++) {
                                        if (i32 > 0) {
                                            sb2.append("\n");
                                        }
                                        sb2.append(arrayListArr4[i28].get(i32));
                                    }
                                    int size = arrayListArr4[i28].size();
                                    textView2.setText(sb2);
                                    if (i27 == 0) {
                                        this.x = Math.max(this.x, size);
                                        this.y = Math.max(this.y, textView2.getLineHeight() * size);
                                    }
                                }
                            }
                            i29++;
                            arrayList3 = arrayList;
                            textViewArr3 = textViewArr;
                            i10 = 60;
                        }
                    }
                    i27++;
                    c02 = arrayListArr;
                    i26 = i2;
                    z6 = z7;
                    i10 = 60;
                }
                i26++;
                z6 = z6;
                i10 = 60;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
            float f3 = 6.0f;
            layoutParams.topMargin = gm.L((this.x > 2 || wj2Var.getVisibility() == 0) ? 6.0f : 12.0f);
            if (this.x <= 2 && wj2Var.getVisibility() != 0) {
                f3 = 12.0f;
            }
            layoutParams.bottomMargin = gm.L(f3);
            layoutParams.gravity = ((this.x > 2 || wj2Var.getVisibility() == 0) ? 16 : 80) | (jb6.a0 ? 3 : 5);
            if (i25 == this.x && i24 == this.y) {
                return;
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.F) {
            Paint U0 = cmb.U0("paintDivider", this.a);
            if (U0 == null) {
                U0 = cmb.j0;
            }
            canvas.drawRect(gm.L(jb6.a0 ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - gm.L(jb6.a0 ? 21.33f : 0.0f), getMeasuredHeight(), U0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int L;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30);
        if (!this.G) {
            int L2 = gm.L(60.0f);
            int i3 = this.x;
            wj2 wj2Var = this.r;
            if (i3 > 2 || wj2Var.getVisibility() == 0) {
                L = gm.L(wj2Var.getVisibility() == 0 ? 21.0f : 0.0f) + gm.L(15.0f) + this.y;
            } else {
                L = 0;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max(L2, L) + (this.F ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wj2 wj2Var = this.r;
        if (wj2Var == null || wj2Var.getVisibility() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        ViewGroup[] viewGroupArr = this.f;
        float x2 = x - viewGroupArr[0].getX();
        FrameLayout frameLayout = this.e;
        float x3 = x2 - frameLayout.getX();
        FrameLayout frameLayout2 = this.s;
        return wj2Var.getClickBounds().contains((int) ((x3 - frameLayout2.getX()) - wj2Var.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - wj2Var.getY()));
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        wj2 wj2Var = this.r;
        if (wj2Var != null) {
            wj2Var.setOnClickListener(onClickListener);
        }
    }
}
