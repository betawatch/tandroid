package org.telegram.ui.Cells;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.tz;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.x41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class f0 extends View {
    public int D;
    public final ImageReceiver E;
    public boolean F;
    public boolean G;
    public final int H;
    public boolean I;
    public final y J;
    public int K;
    public StaticLayout a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int h;
    public int n;
    public q80 r;
    public final ji.a s;
    public d0 w;
    public final int x;
    public final org.telegram.ui.ActionBar.p6 y;

    public f0(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.s = new ji.a(this);
        this.H = org.telegram.messenger.i0.L(4.0f);
        this.x = i10;
        this.y = p6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.J0 = true;
        imageReceiver.A0 = true;
        imageReceiver.s1 = zs.X4;
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.i6, p6Var);
        int i11 = tz.Y0;
        this.K = i11;
        y a02 = org.telegram.ui.ActionBar.t6.a0(w02, i11, i11);
        this.J = a02;
        a02.setCallback(this);
    }

    public final void a() {
        if (this.r != null) {
            this.r = null;
        }
        this.s.f(true);
        invalidate();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:18|(1:129)(1:25)|(1:128)(1:28)|29|(1:127)(1:32)|33|(2:35|(3:37|(1:39)|40))(1:(2:100|(15:102|(1:104)(2:110|(16:112|(4:114|(3:116|(2:118|119)(1:121)|120)|122|123)(1:126)|124|125|106|(1:108)|109|42|43|44|(1:46)(1:96)|47|48|(11:50|(1:52)(7:77|(1:79)|80|(4:83|(2:85|86)(1:88)|87|81)|89|90|(1:92))|53|54|55|(1:57)(1:73)|58|(1:60)|61|62|(1:71))(2:93|(1:95))|66|(2:68|69)(1:70)))|105|106|(0)|109|42|43|44|(0)(0)|47|48|(0)(0)|66|(0)(0))))|41|42|43|44|(0)(0)|47|48|(0)(0)|66|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a2  */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z10, long j10, String str, TLObject tLObject, TL_bots.BotInfo botInfo, String str2) {
        float f7;
        BitmapDrawable bitmapDrawable;
        float f10;
        boolean z11;
        boolean z12;
        int min;
        boolean z13;
        boolean z14 = tLObject != null;
        boolean isEmpty = TextUtils.isEmpty(str);
        if ((str == null || str.length() == 0) && TextUtils.isEmpty(str2) && !z14) {
            setVisibility(8);
            return;
        }
        String str3 = str == null ? "" : str;
        if (str3.equals(this.b) && TextUtils.equals(this.c, str2) && this.F == z14) {
            return;
        }
        boolean z15 = TextUtils.isEmpty(str3) && tLObject == null && !TextUtils.isEmpty(str2) && j10 != 0;
        boolean z16 = z14 || z15;
        this.F = z16;
        this.G = !isEmpty || z15;
        float f11 = 4.0f;
        ImageReceiver imageReceiver = this.E;
        if (z15) {
            if (!Objects.equals(this.d, "setup")) {
                this.d = "setup";
                imageReceiver.w0(new up(new e0(getContext())));
                int L = org.telegram.messenger.i0.L(tz.Y0) - org.telegram.messenger.i0.L(2.0f);
                int L2 = org.telegram.messenger.i0.L(4.0f);
                if (!this.G) {
                    L2 = L;
                }
                imageReceiver.K0(L, L, L2, L2);
            }
        } else if (z16) {
            String o10 = org.telegram.messenger.w8.o(botInfo);
            if (!Objects.equals(this.d, o10)) {
                this.d = o10;
                if (tLObject instanceof TLRPC.TL_photo) {
                    TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                    imageReceiver.q0(ic.i(org.telegram.messenger.b8.w(photo.sizes, 400, false, null, false), photo), "400_400", null, "jpg", botInfo, 0);
                } else if (tLObject instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) tLObject;
                    TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 400, false, null, false);
                    if (tz.o() != 0) {
                        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                        int size = arrayList.size();
                        f7 = 2.0f;
                        BitmapDrawable bitmapDrawable2 = null;
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.PhotoSize photoSize = arrayList.get(i10);
                            i10++;
                            float f12 = f11;
                            TLRPC.PhotoSize photoSize2 = photoSize;
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                bitmapDrawable2 = new BitmapDrawable(getResources(), hc.F("b", photoSize2.bytes));
                            }
                            f11 = f12;
                        }
                        bitmapDrawable = bitmapDrawable2;
                    } else {
                        f7 = 2.0f;
                        bitmapDrawable = null;
                    }
                    f10 = f11;
                    z11 = true;
                    imageReceiver.u0(ic.b(document), "g", ic.d(jj.J0(document), document), null, ic.c(w9, document), "86_86_b", bitmapDrawable, document.size, "mp4", botInfo, 0);
                    int L3 = org.telegram.messenger.i0.L(tz.Y0) - org.telegram.messenger.i0.L(f7);
                    int L4 = org.telegram.messenger.i0.L(f10);
                    if (!this.G) {
                        L4 = L3;
                    }
                    imageReceiver.K0(L3, L3, L4, L4);
                    z12 = z11;
                    String str4 = org.telegram.messenger.i0.U.matcher(str3).replaceAll("\u200c");
                    this.b = str4;
                    this.c = str2;
                    setVisibility(0);
                    if (org.telegram.messenger.i0.Q1()) {
                        min = org.telegram.messenger.i0.Q0();
                    } else {
                        Point point = org.telegram.messenger.i0.q;
                        min = Math.min(point.x, point.y);
                    }
                    int i11 = (int) (min * 0.7f);
                    if (this.G) {
                        String[] split = str3.split("\n");
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (z15) {
                            Object[] objArr = new Object[2];
                            objArr[0] = org.telegram.messenger.o5.l(this.x, j10);
                            objArr[z12] = str2;
                            org.telegram.messenger.m5.p(null, null, 2131748706, objArr, spannableStringBuilder);
                            z13 = false;
                        } else {
                            String L0 = cd.L0(2131753060, null);
                            if (z10) {
                                spannableStringBuilder.append((CharSequence) L0);
                                spannableStringBuilder.append((CharSequence) "\n\n");
                            }
                            for (int i12 = 0; i12 < split.length; i12++) {
                                spannableStringBuilder.append((CharSequence) split[i12].trim());
                                if (i12 != split.length - 1) {
                                    spannableStringBuilder.append((CharSequence) "\n");
                                }
                            }
                            z13 = false;
                            jj.d(spannableStringBuilder, false);
                            if (z10) {
                                spannableStringBuilder.setSpan(new x41(org.telegram.messenger.i0.o()), 0, L0.length(), 33);
                            }
                        }
                        org.telegram.messenger.k6.l(spannableStringBuilder, org.telegram.ui.ActionBar.t6.o2.getFontMetricsInt(), z13);
                        try {
                            StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.t6.o2, i11 - (this.F ? org.telegram.messenger.i0.L(5.0f) : 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            this.a = staticLayout;
                            this.e = 0;
                            this.f = staticLayout.getHeight() + org.telegram.messenger.i0.L(22.0f);
                            int lineCount = this.a.getLineCount();
                            for (int i13 = 0; i13 < lineCount; i13++) {
                                this.e = (int) Math.ceil(Math.max(this.e, this.a.getLineWidth(i13) + this.a.getLineLeft(i13)));
                            }
                            if (this.e > i11 || this.F) {
                                this.e = i11;
                            }
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, z12);
                        }
                    } else if (this.F) {
                        this.e = i11;
                    }
                    int L5 = org.telegram.messenger.i0.L(22.0f) + this.e;
                    this.e = L5;
                    if (this.F) {
                        int i14 = this.f;
                        int i15 = (int) (L5 * 0.5625d);
                        this.D = i15;
                        this.f = org.telegram.messenger.m5.C(f10, i15, i14);
                        return;
                    }
                    return;
                }
                f7 = 2.0f;
                f10 = 4.0f;
                z11 = true;
                int L32 = org.telegram.messenger.i0.L(tz.Y0) - org.telegram.messenger.i0.L(f7);
                int L42 = org.telegram.messenger.i0.L(f10);
                if (!this.G) {
                }
                imageReceiver.K0(L32, L32, L42, L42);
                z12 = z11;
                String str42 = org.telegram.messenger.i0.U.matcher(str3).replaceAll("\u200c");
                this.b = str42;
                this.c = str2;
                setVisibility(0);
                if (org.telegram.messenger.i0.Q1()) {
                }
                int i112 = (int) (min * 0.7f);
                if (this.G) {
                }
                int L52 = org.telegram.messenger.i0.L(22.0f) + this.e;
                this.e = L52;
                if (this.F) {
                }
            }
        }
        f10 = 4.0f;
        z12 = 1;
        String str422 = org.telegram.messenger.i0.U.matcher(str3).replaceAll("\u200c");
        this.b = str422;
        this.c = str2;
        setVisibility(0);
        if (org.telegram.messenger.i0.Q1()) {
        }
        int i1122 = (int) (min * 0.7f);
        if (this.G) {
        }
        int L522 = org.telegram.messenger.i0.L(22.0f) + this.e;
        this.e = L522;
        if (this.F) {
        }
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.a;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.e) / 2;
        int L = org.telegram.messenger.i0.L(2.0f) + this.D;
        Drawable l4 = org.telegram.ui.ActionBar.t6.q3.l();
        if (l4 != null) {
            l4.setBounds(width, L, this.e + width, this.f + L);
            l4.draw(canvas);
        }
        Point point = org.telegram.messenger.i0.q;
        int i10 = point.x;
        int i11 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i10 = view.getMeasuredWidth();
            i11 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.p6 p6Var = this.y;
        Drawable drawable = p6Var != null ? p6Var.getDrawable("drawableMsgInMedia") : null;
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.t6.R0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) drawable;
        c5Var.p((int) getY(), i10, i11);
        c5Var.setBounds(width, 0, this.e + width, this.f);
        c5Var.draw(canvas);
        y yVar = this.J;
        if (yVar != null) {
            int i12 = this.K;
            int i13 = tz.Y0;
            if (i12 != i13) {
                this.K = i13;
                org.telegram.ui.ActionBar.t6.G1(yVar, i13, i13);
            }
            yVar.setBounds(org.telegram.messenger.i0.L(2.0f) + width, org.telegram.messenger.i0.L(2.0f), (this.e + width) - org.telegram.messenger.i0.L(2.0f), this.f - org.telegram.messenger.i0.L(2.0f));
            yVar.draw(canvas);
        }
        int i14 = this.H;
        float f7 = width + i14;
        float f10 = i14;
        float f11 = this.e - (i14 * 2);
        float f12 = this.D - i14;
        ImageReceiver imageReceiver = this.E;
        imageReceiver.y0(f7, f10, f11, f12);
        imageReceiver.h(canvas, null);
        org.telegram.ui.ActionBar.t6.o2.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Sc, p6Var));
        org.telegram.ui.ActionBar.t6.o2.linkColor = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, p6Var);
        canvas.save();
        int L2 = org.telegram.messenger.i0.L(this.F ? 14.0f : 11.0f) + width;
        this.h = L2;
        float f13 = L2;
        int L3 = org.telegram.messenger.i0.L(11.0f) + L;
        this.n = L3;
        canvas.translate(f13, L3);
        if (this.s.h(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), org.telegram.messenger.i0.L(8.0f) + this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        y yVar;
        boolean z11;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (this.a != null) {
            if (motionEvent.getAction() == 0 || (this.r != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    a();
                    try {
                        int i10 = (int) (y3 - this.n);
                        int lineForVertical = this.a.getLineForVertical(i10);
                        float f7 = (int) (x10 - this.h);
                        int offsetForHorizontal = this.a.getOffsetForHorizontal(lineForVertical, f7);
                        float lineLeft = this.a.getLineLeft(lineForVertical);
                        if (lineLeft > f7 || lineLeft + this.a.getLineWidth(lineForVertical) < f7) {
                            a();
                        } else {
                            Spannable spannable = (Spannable) this.a.getText();
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0) {
                                a();
                                this.r = new q80(clickableSpanArr[0], this.y, f7, i10, 0);
                                try {
                                    try {
                                        int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                                        k80 b10 = this.r.b();
                                        b10.d(this.a, spanStart, 0.0f);
                                        this.a.getSelectionPath(spanStart, spannable.getSpanEnd(clickableSpanArr[0]), b10);
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                    }
                                    this.s.b(this.r, null);
                                    invalidate();
                                    z10 = true;
                                } catch (Exception e7) {
                                    e = e7;
                                    z11 = true;
                                    a();
                                    org.telegram.messenger.f8.g(e, true);
                                    z10 = z11;
                                    yVar = this.J;
                                    if (yVar != null) {
                                    }
                                    if (z10) {
                                    }
                                }
                            } else {
                                a();
                            }
                        }
                    } catch (Exception e10) {
                        e = e10;
                        z11 = false;
                    }
                } else {
                    q80 q80Var = this.r;
                    if (q80Var != null) {
                        try {
                            ClickableSpan clickableSpan = (ClickableSpan) q80Var.i;
                            if (clickableSpan instanceof e51) {
                                String url = ((e51) clickableSpan).getURL();
                                if (!url.startsWith("@")) {
                                    if (!url.startsWith("#")) {
                                        if (!url.startsWith("/")) {
                                            if (url.startsWith("$")) {
                                            }
                                        }
                                    }
                                }
                                d0 d0Var = this.w;
                                if (d0Var != null) {
                                    ((org.telegram.ui.y0) d0Var).r(url);
                                }
                            } else if (clickableSpan instanceof URLSpan) {
                                d0 d0Var2 = this.w;
                                if (d0Var2 != null) {
                                    ((org.telegram.ui.y0) d0Var2).r(((URLSpan) clickableSpan).getURL());
                                }
                            } else if (clickableSpan != null) {
                                clickableSpan.onClick(this);
                            }
                        } catch (Exception e11) {
                            org.telegram.messenger.f8.g(e11, true);
                        }
                        a();
                        z10 = true;
                    }
                }
                yVar = this.J;
                if (yVar != null) {
                    if (!z10 && y3 > 0.0f && motionEvent.getAction() == 0 && isClickable()) {
                        yVar.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                        yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                        invalidate();
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        yVar.setState(new int[0]);
                        invalidate();
                        if (!z10 && motionEvent.getAction() == 1) {
                            performClick();
                        }
                    }
                    z10 = true;
                }
                return !z10 || super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 3) {
                a();
            }
        }
        z10 = false;
        yVar = this.J;
        if (yVar != null) {
        }
        if (z10) {
            return true;
        }
    }

    public void setAnimating(boolean z10) {
        this.I = z10;
    }

    public void setDelegate(d0 d0Var) {
        this.w = d0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.J || super.verifyDrawable(drawable);
    }
}
