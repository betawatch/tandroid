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
import org.telegram.messenger.gc;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.x70;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
    public x70 r;
    public final n2.n0 s;
    public d0 w;
    public final int x;
    public final org.telegram.ui.ActionBar.f6 y;

    public f0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.s = new n2.n0(this);
        this.H = org.telegram.messenger.g0.L(4.0f);
        this.x = i7;
        this.y = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.J0 = true;
        imageReceiver.A0 = true;
        imageReceiver.s1 = qs.X4;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, f6Var);
        int i10 = iz.Y0;
        this.K = i10;
        y a02 = org.telegram.ui.ActionBar.k6.a0(w02, i10, i10);
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
    public final void b(boolean z9, long j3, String str, TLObject tLObject, TL_bots.BotInfo botInfo, String str2) {
        float f10;
        BitmapDrawable bitmapDrawable;
        float f11;
        boolean z10;
        boolean z11;
        int min;
        boolean z12;
        boolean z13 = tLObject != null;
        boolean isEmpty = TextUtils.isEmpty(str);
        if ((str == null || str.length() == 0) && TextUtils.isEmpty(str2) && !z13) {
            setVisibility(8);
            return;
        }
        String str3 = str == null ? "" : str;
        if (str3.equals(this.b) && TextUtils.equals(this.c, str2) && this.F == z13) {
            return;
        }
        boolean z14 = TextUtils.isEmpty(str3) && tLObject == null && !TextUtils.isEmpty(str2) && j3 != 0;
        boolean z15 = z13 || z14;
        this.F = z15;
        this.G = !isEmpty || z14;
        float f12 = 4.0f;
        ImageReceiver imageReceiver = this.E;
        if (z14) {
            if (!Objects.equals(this.d, "setup")) {
                this.d = "setup";
                imageReceiver.w0(new np(new e0(getContext())));
                int L = org.telegram.messenger.g0.L(iz.Y0) - org.telegram.messenger.g0.L(2.0f);
                int L2 = org.telegram.messenger.g0.L(4.0f);
                if (!this.G) {
                    L2 = L;
                }
                imageReceiver.K0(L, L, L2, L2);
            }
        } else if (z15) {
            String o4 = org.telegram.messenger.r8.o(botInfo);
            if (!Objects.equals(this.d, o4)) {
                this.d = o4;
                if (tLObject instanceof TLRPC.TL_photo) {
                    TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                    imageReceiver.q0(hc.i(org.telegram.messenger.w7.w(photo.sizes, 400, false, null, false), photo), "400_400", null, "jpg", botInfo, 0);
                } else if (tLObject instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) tLObject;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 400, false, null, false);
                    if (iz.o() != 0) {
                        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                        int size = arrayList.size();
                        f10 = 2.0f;
                        BitmapDrawable bitmapDrawable2 = null;
                        int i7 = 0;
                        while (i7 < size) {
                            TLRPC.PhotoSize photoSize = arrayList.get(i7);
                            i7++;
                            float f13 = f12;
                            TLRPC.PhotoSize photoSize2 = photoSize;
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                bitmapDrawable2 = new BitmapDrawable(getResources(), gc.F("b", photoSize2.bytes));
                            }
                            f12 = f13;
                        }
                        bitmapDrawable = bitmapDrawable2;
                    } else {
                        f10 = 2.0f;
                        bitmapDrawable = null;
                    }
                    f11 = f12;
                    z10 = true;
                    imageReceiver.u0(hc.b(document), "g", hc.d(ij.J0(document), document), null, hc.c(w10, document), "86_86_b", bitmapDrawable, document.size, "mp4", botInfo, 0);
                    int L3 = org.telegram.messenger.g0.L(iz.Y0) - org.telegram.messenger.g0.L(f10);
                    int L4 = org.telegram.messenger.g0.L(f11);
                    if (!this.G) {
                        L4 = L3;
                    }
                    imageReceiver.K0(L3, L3, L4, L4);
                    z11 = z10;
                    String str4 = org.telegram.messenger.g0.U.matcher(str3).replaceAll("\u200c");
                    this.b = str4;
                    this.c = str2;
                    setVisibility(0);
                    if (org.telegram.messenger.g0.Q1()) {
                        min = org.telegram.messenger.g0.Q0();
                    } else {
                        Point point = org.telegram.messenger.g0.q;
                        min = Math.min(point.x, point.y);
                    }
                    int i10 = (int) (min * 0.7f);
                    if (this.G) {
                        String[] split = str3.split("\n");
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (z14) {
                            Object[] objArr = new Object[2];
                            objArr[0] = org.telegram.messenger.m5.l(this.x, j3);
                            objArr[z11] = str2;
                            org.telegram.messenger.k5.q(null, null, 2131748690, objArr, spannableStringBuilder);
                            z12 = false;
                        } else {
                            String M0 = hd.M0(2131753060, null);
                            if (z9) {
                                spannableStringBuilder.append((CharSequence) M0);
                                spannableStringBuilder.append((CharSequence) "\n\n");
                            }
                            for (int i11 = 0; i11 < split.length; i11++) {
                                spannableStringBuilder.append((CharSequence) split[i11].trim());
                                if (i11 != split.length - 1) {
                                    spannableStringBuilder.append((CharSequence) "\n");
                                }
                            }
                            z12 = false;
                            ij.d(spannableStringBuilder, false);
                            if (z9) {
                                spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), 0, M0.length(), 33);
                            }
                        }
                        org.telegram.messenger.i6.l(spannableStringBuilder, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), z12);
                        try {
                            StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.k6.o2, i10 - (this.F ? org.telegram.messenger.g0.L(5.0f) : 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            this.a = staticLayout;
                            this.e = 0;
                            this.f = staticLayout.getHeight() + org.telegram.messenger.g0.L(22.0f);
                            int lineCount = this.a.getLineCount();
                            for (int i12 = 0; i12 < lineCount; i12++) {
                                this.e = (int) Math.ceil(Math.max(this.e, this.a.getLineWidth(i12) + this.a.getLineLeft(i12)));
                            }
                            if (this.e > i10 || this.F) {
                                this.e = i10;
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, z11);
                        }
                    } else if (this.F) {
                        this.e = i10;
                    }
                    int L5 = org.telegram.messenger.g0.L(22.0f) + this.e;
                    this.e = L5;
                    if (this.F) {
                        int i13 = this.f;
                        int i14 = (int) (L5 * 0.5625d);
                        this.D = i14;
                        this.f = org.telegram.messenger.k5.C(f11, i14, i13);
                        return;
                    }
                    return;
                }
                f10 = 2.0f;
                f11 = 4.0f;
                z10 = true;
                int L32 = org.telegram.messenger.g0.L(iz.Y0) - org.telegram.messenger.g0.L(f10);
                int L42 = org.telegram.messenger.g0.L(f11);
                if (!this.G) {
                }
                imageReceiver.K0(L32, L32, L42, L42);
                z11 = z10;
                String str42 = org.telegram.messenger.g0.U.matcher(str3).replaceAll("\u200c");
                this.b = str42;
                this.c = str2;
                setVisibility(0);
                if (org.telegram.messenger.g0.Q1()) {
                }
                int i102 = (int) (min * 0.7f);
                if (this.G) {
                }
                int L52 = org.telegram.messenger.g0.L(22.0f) + this.e;
                this.e = L52;
                if (this.F) {
                }
            }
        }
        f11 = 4.0f;
        z11 = 1;
        String str422 = org.telegram.messenger.g0.U.matcher(str3).replaceAll("\u200c");
        this.b = str422;
        this.c = str2;
        setVisibility(0);
        if (org.telegram.messenger.g0.Q1()) {
        }
        int i1022 = (int) (min * 0.7f);
        if (this.G) {
        }
        int L522 = org.telegram.messenger.g0.L(22.0f) + this.e;
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
        int L = org.telegram.messenger.g0.L(2.0f) + this.D;
        Drawable l10 = org.telegram.ui.ActionBar.k6.q3.l();
        if (l10 != null) {
            l10.setBounds(width, L, this.e + width, this.f + L);
            l10.draw(canvas);
        }
        Point point = org.telegram.messenger.g0.q;
        int i7 = point.x;
        int i10 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i7 = view.getMeasuredWidth();
            i10 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.y;
        Drawable drawable = f6Var != null ? f6Var.getDrawable("drawableMsgInMedia") : null;
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) drawable;
        t4Var.p((int) getY(), i7, i10);
        t4Var.setBounds(width, 0, this.e + width, this.f);
        t4Var.draw(canvas);
        y yVar = this.J;
        if (yVar != null) {
            int i11 = this.K;
            int i12 = iz.Y0;
            if (i11 != i12) {
                this.K = i12;
                org.telegram.ui.ActionBar.k6.G1(yVar, i12, i12);
            }
            yVar.setBounds(org.telegram.messenger.g0.L(2.0f) + width, org.telegram.messenger.g0.L(2.0f), (this.e + width) - org.telegram.messenger.g0.L(2.0f), this.f - org.telegram.messenger.g0.L(2.0f));
            yVar.draw(canvas);
        }
        int i13 = this.H;
        float f10 = width + i13;
        float f11 = i13;
        float f12 = this.e - (i13 * 2);
        float f13 = this.D - i13;
        ImageReceiver imageReceiver = this.E;
        imageReceiver.y0(f10, f11, f12, f13);
        imageReceiver.h(canvas, null);
        org.telegram.ui.ActionBar.k6.o2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, f6Var));
        org.telegram.ui.ActionBar.k6.o2.linkColor = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, f6Var);
        canvas.save();
        int L2 = org.telegram.messenger.g0.L(this.F ? 14.0f : 11.0f) + width;
        this.h = L2;
        float f14 = L2;
        int L3 = org.telegram.messenger.g0.L(11.0f) + L;
        this.n = L3;
        canvas.translate(f14, L3);
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
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), org.telegram.messenger.g0.L(8.0f) + this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        y yVar;
        boolean z10;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (this.a != null) {
            if (motionEvent.getAction() == 0 || (this.r != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    a();
                    try {
                        int i7 = (int) (y10 - this.n);
                        int lineForVertical = this.a.getLineForVertical(i7);
                        float f10 = (int) (x10 - this.h);
                        int offsetForHorizontal = this.a.getOffsetForHorizontal(lineForVertical, f10);
                        float lineLeft = this.a.getLineLeft(lineForVertical);
                        if (lineLeft > f10 || lineLeft + this.a.getLineWidth(lineForVertical) < f10) {
                            a();
                        } else {
                            Spannable spannable = (Spannable) this.a.getText();
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0) {
                                a();
                                this.r = new x70(clickableSpanArr[0], this.y, f10, i7, 0);
                                try {
                                    try {
                                        int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                                        r70 b10 = this.r.b();
                                        b10.d(this.a, spanStart, 0.0f);
                                        this.a.getSelectionPath(spanStart, spannable.getSpanEnd(clickableSpanArr[0]), b10);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    this.s.b(this.r, null);
                                    invalidate();
                                    z9 = true;
                                } catch (Exception e11) {
                                    e = e11;
                                    z10 = true;
                                    a();
                                    org.telegram.messenger.a8.g(e, true);
                                    z9 = z10;
                                    yVar = this.J;
                                    if (yVar != null) {
                                    }
                                    if (z9) {
                                    }
                                }
                            } else {
                                a();
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        z10 = false;
                    }
                } else {
                    x70 x70Var = this.r;
                    if (x70Var != null) {
                        try {
                            ClickableSpan clickableSpan = (ClickableSpan) x70Var.i;
                            if (clickableSpan instanceof b41) {
                                String url = ((b41) clickableSpan).getURL();
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
                                    ((org.telegram.ui.w0) d0Var).t(url);
                                }
                            } else if (clickableSpan instanceof URLSpan) {
                                d0 d0Var2 = this.w;
                                if (d0Var2 != null) {
                                    ((org.telegram.ui.w0) d0Var2).t(((URLSpan) clickableSpan).getURL());
                                }
                            } else if (clickableSpan != null) {
                                clickableSpan.onClick(this);
                            }
                        } catch (Exception e13) {
                            org.telegram.messenger.a8.g(e13, true);
                        }
                        a();
                        z9 = true;
                    }
                }
                yVar = this.J;
                if (yVar != null) {
                    if (!z9 && y10 > 0.0f && motionEvent.getAction() == 0 && isClickable()) {
                        yVar.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                        yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                        invalidate();
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        yVar.setState(new int[0]);
                        invalidate();
                        if (!z9 && motionEvent.getAction() == 1) {
                            performClick();
                        }
                    }
                    z9 = true;
                }
                return !z9 || super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 3) {
                a();
            }
        }
        z9 = false;
        yVar = this.J;
        if (yVar != null) {
        }
        if (z9) {
            return true;
        }
    }

    public void setAnimating(boolean z9) {
        this.I = z9;
    }

    public void setDelegate(d0 d0Var) {
        this.w = d0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.J || super.verifyDrawable(drawable);
    }
}
