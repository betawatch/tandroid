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
import org.telegram.messenger.ac;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.messenger.zb;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.v31;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class f0 extends View {
    public int E;
    public final ImageReceiver F;
    public boolean G;
    public boolean H;
    public final int I;
    public boolean J;
    public final y K;
    public int L;
    public StaticLayout a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int h;
    public int n;
    public t70 r;
    public final m2.p0 s;
    public d0 w;
    public final int x;
    public final org.telegram.ui.ActionBar.e6 y;

    public f0(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.s = new m2.p0(this);
        this.I = org.telegram.messenger.g0.L(4.0f);
        this.x = i3;
        this.y = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.K0 = true;
        imageReceiver.B0 = true;
        imageReceiver.t1 = hs.X4;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var);
        int i10 = az.Y0;
        this.L = i10;
        y a02 = org.telegram.ui.ActionBar.k6.a0(w02, i10, i10);
        this.K = a02;
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
        float f10;
        BitmapDrawable bitmapDrawable;
        float f11;
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
        if (str3.equals(this.b) && TextUtils.equals(this.c, str2) && this.G == z14) {
            return;
        }
        boolean z15 = TextUtils.isEmpty(str3) && tLObject == null && !TextUtils.isEmpty(str2) && j10 != 0;
        boolean z16 = z14 || z15;
        this.G = z16;
        this.H = !isEmpty || z15;
        float f12 = 4.0f;
        ImageReceiver imageReceiver = this.F;
        if (z15) {
            if (!Objects.equals(this.d, "setup")) {
                this.d = "setup";
                imageReceiver.w0(new np(new e0(getContext())));
                int L = org.telegram.messenger.g0.L(az.Y0) - org.telegram.messenger.g0.L(2.0f);
                int L2 = org.telegram.messenger.g0.L(4.0f);
                if (!this.H) {
                    L2 = L;
                }
                imageReceiver.K0(L, L, L2, L2);
            }
        } else if (z16) {
            String o10 = org.telegram.messenger.r8.o(botInfo);
            if (!Objects.equals(this.d, o10)) {
                this.d = o10;
                if (tLObject instanceof TLRPC.TL_photo) {
                    TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                    imageReceiver.q0(ac.i(org.telegram.messenger.w7.w(photo.sizes, 400, false, null, false), photo), "400_400", null, "jpg", botInfo, 0);
                } else if (tLObject instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) tLObject;
                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 400, false, null, false);
                    if (az.o() != 0) {
                        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                        int size = arrayList.size();
                        f10 = 2.0f;
                        BitmapDrawable bitmapDrawable2 = null;
                        int i3 = 0;
                        while (i3 < size) {
                            TLRPC.PhotoSize photoSize = arrayList.get(i3);
                            i3++;
                            float f13 = f12;
                            TLRPC.PhotoSize photoSize2 = photoSize;
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                bitmapDrawable2 = new BitmapDrawable(getResources(), zb.F("b", photoSize2.bytes));
                            }
                            f12 = f13;
                        }
                        bitmapDrawable = bitmapDrawable2;
                    } else {
                        f10 = 2.0f;
                        bitmapDrawable = null;
                    }
                    f11 = f12;
                    z11 = true;
                    imageReceiver.u0(ac.b(document), "g", ac.d(zi.J0(document), document), null, ac.c(w10, document), "86_86_b", bitmapDrawable, document.size, "mp4", botInfo, 0);
                    int L3 = org.telegram.messenger.g0.L(az.Y0) - org.telegram.messenger.g0.L(f10);
                    int L4 = org.telegram.messenger.g0.L(f11);
                    if (!this.H) {
                        L4 = L3;
                    }
                    imageReceiver.K0(L3, L3, L4, L4);
                    z12 = z11;
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
                    if (this.H) {
                        String[] split = str3.split("\n");
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (z15) {
                            Object[] objArr = new Object[2];
                            objArr[0] = org.telegram.messenger.m5.l(this.x, j10);
                            objArr[z12] = str2;
                            org.telegram.messenger.k5.q(null, null, 2131748699, objArr, spannableStringBuilder);
                            z13 = false;
                        } else {
                            String M0 = bd.M0(2131753060, null);
                            if (z10) {
                                spannableStringBuilder.append((CharSequence) M0);
                                spannableStringBuilder.append((CharSequence) "\n\n");
                            }
                            for (int i11 = 0; i11 < split.length; i11++) {
                                spannableStringBuilder.append((CharSequence) split[i11].trim());
                                if (i11 != split.length - 1) {
                                    spannableStringBuilder.append((CharSequence) "\n");
                                }
                            }
                            z13 = false;
                            zi.d(spannableStringBuilder, false);
                            if (z10) {
                                spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, M0.length(), 33);
                            }
                        }
                        org.telegram.messenger.i6.l(spannableStringBuilder, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), z13);
                        try {
                            StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, org.telegram.ui.ActionBar.k6.o2, i10 - (this.G ? org.telegram.messenger.g0.L(5.0f) : 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            this.a = staticLayout;
                            this.e = 0;
                            this.f = staticLayout.getHeight() + org.telegram.messenger.g0.L(22.0f);
                            int lineCount = this.a.getLineCount();
                            for (int i12 = 0; i12 < lineCount; i12++) {
                                this.e = (int) Math.ceil(Math.max(this.e, this.a.getLineWidth(i12) + this.a.getLineLeft(i12)));
                            }
                            if (this.e > i10 || this.G) {
                                this.e = i10;
                            }
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, z12);
                        }
                    } else if (this.G) {
                        this.e = i10;
                    }
                    int L5 = org.telegram.messenger.g0.L(22.0f) + this.e;
                    this.e = L5;
                    if (this.G) {
                        int i13 = this.f;
                        int i14 = (int) (L5 * 0.5625d);
                        this.E = i14;
                        this.f = org.telegram.messenger.k5.C(f11, i14, i13);
                        return;
                    }
                    return;
                }
                f10 = 2.0f;
                f11 = 4.0f;
                z11 = true;
                int L32 = org.telegram.messenger.g0.L(az.Y0) - org.telegram.messenger.g0.L(f10);
                int L42 = org.telegram.messenger.g0.L(f11);
                if (!this.H) {
                }
                imageReceiver.K0(L32, L32, L42, L42);
                z12 = z11;
                String str42 = org.telegram.messenger.g0.U.matcher(str3).replaceAll("\u200c");
                this.b = str42;
                this.c = str2;
                setVisibility(0);
                if (org.telegram.messenger.g0.Q1()) {
                }
                int i102 = (int) (min * 0.7f);
                if (this.H) {
                }
                int L52 = org.telegram.messenger.g0.L(22.0f) + this.e;
                this.e = L52;
                if (this.G) {
                }
            }
        }
        f11 = 4.0f;
        z12 = 1;
        String str422 = org.telegram.messenger.g0.U.matcher(str3).replaceAll("\u200c");
        this.b = str422;
        this.c = str2;
        setVisibility(0);
        if (org.telegram.messenger.g0.Q1()) {
        }
        int i1022 = (int) (min * 0.7f);
        if (this.H) {
        }
        int L522 = org.telegram.messenger.g0.L(22.0f) + this.e;
        this.e = L522;
        if (this.G) {
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
        this.F.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.e) / 2;
        int L = org.telegram.messenger.g0.L(2.0f) + this.E;
        Drawable l10 = org.telegram.ui.ActionBar.k6.q3.l();
        if (l10 != null) {
            l10.setBounds(width, L, this.e + width, this.f + L);
            l10.draw(canvas);
        }
        Point point = org.telegram.messenger.g0.q;
        int i3 = point.x;
        int i10 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i3 = view.getMeasuredWidth();
            i10 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.y;
        Drawable drawable = e6Var != null ? e6Var.getDrawable("drawableMsgInMedia") : null;
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.k6.R0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) drawable;
        t4Var.p((int) getY(), i3, i10);
        t4Var.setBounds(width, 0, this.e + width, this.f);
        t4Var.draw(canvas);
        y yVar = this.K;
        if (yVar != null) {
            int i11 = this.L;
            int i12 = az.Y0;
            if (i11 != i12) {
                this.L = i12;
                org.telegram.ui.ActionBar.k6.G1(yVar, i12, i12);
            }
            yVar.setBounds(org.telegram.messenger.g0.L(2.0f) + width, org.telegram.messenger.g0.L(2.0f), (this.e + width) - org.telegram.messenger.g0.L(2.0f), this.f - org.telegram.messenger.g0.L(2.0f));
            yVar.draw(canvas);
        }
        int i13 = this.I;
        float f10 = width + i13;
        float f11 = i13;
        float f12 = this.e - (i13 * 2);
        float f13 = this.E - i13;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.y0(f10, f11, f12, f13);
        imageReceiver.h(canvas, null);
        org.telegram.ui.ActionBar.k6.o2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Sc, e6Var));
        org.telegram.ui.ActionBar.k6.o2.linkColor = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Uc, e6Var);
        canvas.save();
        int L2 = org.telegram.messenger.g0.L(this.G ? 14.0f : 11.0f) + width;
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
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), org.telegram.messenger.g0.L(8.0f) + this.f);
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
        float y9 = motionEvent.getY();
        if (this.a != null) {
            if (motionEvent.getAction() == 0 || (this.r != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    a();
                    try {
                        int i3 = (int) (y9 - this.n);
                        int lineForVertical = this.a.getLineForVertical(i3);
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
                                this.r = new t70(clickableSpanArr[0], this.y, f10, i3, 0);
                                try {
                                    try {
                                        int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                                        n70 b10 = this.r.b();
                                        b10.d(this.a, spanStart, 0.0f);
                                        this.a.getSelectionPath(spanStart, spannable.getSpanEnd(clickableSpanArr[0]), b10);
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                    }
                                    this.s.b(this.r, null);
                                    invalidate();
                                    z10 = true;
                                } catch (Exception e11) {
                                    e = e11;
                                    z11 = true;
                                    a();
                                    org.telegram.messenger.a8.g(e, true);
                                    z10 = z11;
                                    yVar = this.K;
                                    if (yVar != null) {
                                    }
                                    if (z10) {
                                    }
                                }
                            } else {
                                a();
                            }
                        }
                    } catch (Exception e12) {
                        e = e12;
                        z11 = false;
                    }
                } else {
                    t70 t70Var = this.r;
                    if (t70Var != null) {
                        try {
                            ClickableSpan clickableSpan = (ClickableSpan) t70Var.i;
                            if (clickableSpan instanceof v31) {
                                String url = ((v31) clickableSpan).getURL();
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
                                    ((org.telegram.ui.x0) d0Var).t(url);
                                }
                            } else if (clickableSpan instanceof URLSpan) {
                                d0 d0Var2 = this.w;
                                if (d0Var2 != null) {
                                    ((org.telegram.ui.x0) d0Var2).t(((URLSpan) clickableSpan).getURL());
                                }
                            } else if (clickableSpan != null) {
                                clickableSpan.onClick(this);
                            }
                        } catch (Exception e13) {
                            org.telegram.messenger.a8.g(e13, true);
                        }
                        a();
                        z10 = true;
                    }
                }
                yVar = this.K;
                if (yVar != null) {
                    if (!z10 && y9 > 0.0f && motionEvent.getAction() == 0 && isClickable()) {
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
        yVar = this.K;
        if (yVar != null) {
        }
        if (z10) {
            return true;
        }
    }

    public void setAnimating(boolean z10) {
        this.J = z10;
    }

    public void setDelegate(d0 d0Var) {
        this.w = d0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.K || super.verifyDrawable(drawable);
    }
}
