// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class er0 extends View {
    public int E;
    public final ImageReceiver F;
    public boolean G;
    public boolean H;
    public final int I;
    public boolean J;
    public final fg0 K;
    public int L;
    public StaticLayout a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public int h;
    public int n;
    public m66 r;
    public final i66 s;
    public cr0 w;
    public final int x;
    public final ylb y;

    public er0(int i, ylb ylbVar, Context context) {
        super(context);
        this.s = new i66(this);
        this.I = gm.L(4.0f);
        this.x = i;
        this.y = ylbVar;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.K0 = true;
        imageReceiver.B0 = true;
        imageReceiver.t1 = (short) 300;
        int v0 = cmb.v0(cmb.h6, ylbVar);
        int i2 = gda.U0;
        this.L = i2;
        fg0 Y = cmb.Y(v0, i2, i2);
        this.K = Y;
        Y.setCallback(this);
    }

    public final void a() {
        if (this.r != null) {
            this.r = null;
        }
        this.s.e(true);
        invalidate();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:18|(1:128)(1:25)|(1:127)(1:28)|29|(1:126)(1:32)|33|(2:35|(3:37|(1:39)|40))(1:(2:99|(15:101|(1:103)(2:109|(16:111|(4:113|(3:115|(2:117|118)(1:120)|119)|121|122)(1:125)|123|124|105|(1:107)|108|42|43|44|(1:46)(1:95)|47|48|(9:50|(1:52)(7:76|(1:78)|79|(4:82|(2:84|85)(1:87)|86|80)|88|89|(1:91))|53|54|55|(1:57)(1:73)|58|(2:59|(1:61)(1:62))|(1:71))(2:92|(1:94))|66|(2:68|69)(1:70)))|104|105|(0)|108|42|43|44|(0)(0)|47|48|(0)(0)|66|(0)(0))))|41|42|43|44|(0)(0)|47|48|(0)(0)|66|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0180, code lost:
    
        r0 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(boolean z, long j, String str, TLObject tLObject, TL_bots.BotInfo botInfo, String str2) {
        float f;
        BitmapDrawable bitmapDrawable;
        float f2;
        boolean z2;
        boolean z3;
        int min;
        boolean z4;
        int i;
        boolean z5 = tLObject != null;
        boolean isEmpty = TextUtils.isEmpty(str);
        if ((str == null || str.length() == 0) && TextUtils.isEmpty(str2) && !z5) {
            setVisibility(8);
            return;
        }
        String str3 = str == null ? "" : str;
        if (str3.equals(this.b) && TextUtils.equals(this.c, str2) && this.G == z5) {
            return;
        }
        boolean z6 = TextUtils.isEmpty(str3) && tLObject == null && !TextUtils.isEmpty(str2) && j != 0;
        boolean z7 = z5 || z6;
        this.G = z7;
        this.H = !isEmpty || z6;
        float f3 = 4.0f;
        ImageReceiver imageReceiver = this.F;
        if (z6) {
            if (!Objects.equals(this.d, "setup")) {
                this.d = "setup";
                imageReceiver.g0(new bk2(new dr0(getContext())));
                int L = gm.L(gda.U0) - gm.L(2.0f);
                int L2 = gm.L(4.0f);
                if (!this.H) {
                    L2 = L;
                }
                imageReceiver.r0(L, L, L2, L2);
            }
        } else if (z7) {
            String o = ad4.o(botInfo);
            if (!Objects.equals(this.d, o)) {
                this.d = o;
                if (tLObject instanceof TLRPC.TL_photo) {
                    TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                    imageReceiver.d0(gn5.i(bc4.w(photo.sizes, 400, false, null, false), photo), "400_400", null, "jpg", botInfo, 0);
                } else if (tLObject instanceof TLRPC.Document) {
                    TLRPC.Document document = (TLRPC.Document) tLObject;
                    TLRPC.PhotoSize w = bc4.w(document.thumbs, 400, false, null, false);
                    if (gda.o() != 0) {
                        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                        int size = arrayList.size();
                        f = 2.0f;
                        BitmapDrawable bitmapDrawable2 = null;
                        int i2 = 0;
                        while (i2 < size) {
                            TLRPC.PhotoSize photoSize = arrayList.get(i2);
                            i2++;
                            float f4 = f3;
                            TLRPC.PhotoSize photoSize2 = photoSize;
                            if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                bitmapDrawable2 = new BitmapDrawable(getResources(), fn5.B("b", photoSize2.bytes));
                            }
                            f3 = f4;
                        }
                        bitmapDrawable = bitmapDrawable2;
                    } else {
                        f = 2.0f;
                        bitmapDrawable = null;
                    }
                    f2 = f3;
                    z2 = true;
                    imageReceiver.Y(gn5.b(document), "g", gn5.d(k47.J0(document), document), null, gn5.c(w, document), "86_86_b", bitmapDrawable, document.size, "mp4", botInfo, 0);
                    int L3 = gm.L(gda.U0) - gm.L(f);
                    int L4 = gm.L(f2);
                    if (!this.H) {
                        L4 = L3;
                    }
                    imageReceiver.r0(L3, L3, L4, L4);
                    z3 = z2;
                    String str4 = gm.U.matcher(str3).replaceAll("\u200c");
                    this.b = str4;
                    this.c = str2;
                    setVisibility(0);
                    if (gm.O1()) {
                        min = gm.P0();
                    } else {
                        Point point = gm.q;
                        min = Math.min(point.x, point.y);
                    }
                    int i3 = (int) (min * 0.7f);
                    if (this.H) {
                        String[] split = str3.split("\n");
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        if (z6) {
                            Object[] objArr = new Object[2];
                            objArr[0] = pg3.k(this.x, j);
                            objArr[z3] = str2;
                            kt6.t(null, null, 2131748448, objArr, spannableStringBuilder);
                            z4 = false;
                        } else {
                            String M0 = jb6.M0(2131753025, null);
                            if (z) {
                                spannableStringBuilder.append((CharSequence) M0);
                                spannableStringBuilder.append((CharSequence) "\n\n");
                            }
                            for (int i4 = 0; i4 < split.length; i4++) {
                                spannableStringBuilder.append((CharSequence) split[i4].trim());
                                if (i4 != split.length - 1) {
                                    spannableStringBuilder.append((CharSequence) "\n");
                                }
                            }
                            z4 = false;
                            k47.d(spannableStringBuilder, false);
                            if (z) {
                                spannableStringBuilder.setSpan(new z5c(gm.o()), 0, M0.length(), 33);
                            }
                        }
                        gw3.l(spannableStringBuilder, cmb.n2.getFontMetricsInt(), z4);
                        try {
                            StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, cmb.n2, i3 - (this.G ? gm.L(5.0f) : 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                            this.a = staticLayout;
                            int i5 = 0;
                            this.e = 0;
                            this.f = staticLayout.getHeight() + gm.L(22.0f);
                            int lineCount = this.a.getLineCount();
                            while (true) {
                                i = this.e;
                                if (i5 >= lineCount) {
                                    break;
                                }
                                this.e = (int) Math.ceil(Math.max(i, this.a.getLineWidth(i5) + this.a.getLineLeft(i5)));
                                i5++;
                            }
                            if (i > i3 || this.G) {
                                this.e = i3;
                            }
                        } catch (Exception e) {
                            fc4.g(e, z3);
                        }
                    } else if (this.G) {
                        this.e = i3;
                    }
                    int L5 = gm.L(22.0f) + this.e;
                    this.e = L5;
                    if (this.G) {
                        int i6 = this.f;
                        int i7 = (int) (L5 * 0.5625d);
                        this.E = i7;
                        this.f = hg9.v(f2, i7, i6);
                        return;
                    }
                    return;
                }
                f = 2.0f;
                f2 = 4.0f;
                z2 = true;
                int L32 = gm.L(gda.U0) - gm.L(f);
                int L42 = gm.L(f2);
                if (!this.H) {
                }
                imageReceiver.r0(L32, L32, L42, L42);
                z3 = z2;
                String str42 = gm.U.matcher(str3).replaceAll("\u200c");
                this.b = str42;
                this.c = str2;
                setVisibility(0);
                if (gm.O1()) {
                }
                int i32 = (int) (min * 0.7f);
                if (this.H) {
                }
                int L52 = gm.L(22.0f) + this.e;
                this.e = L52;
                if (this.G) {
                }
            }
        }
        f2 = 4.0f;
        z3 = 1;
        String str422 = gm.U.matcher(str3).replaceAll("\u200c");
        this.b = str422;
        this.c = str2;
        setVisibility(0);
        if (gm.O1()) {
        }
        int i322 = (int) (min * 0.7f);
        if (this.H) {
        }
        int L522 = gm.L(22.0f) + this.e;
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
        this.F.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.e) / 2;
        int L = gm.L(2.0f) + this.E;
        Drawable k = cmb.p3.k();
        if (k != null) {
            k.setBounds(width, L, this.e + width, this.f + L);
            k.draw(canvas);
        }
        Point point = gm.q;
        int i = point.x;
        int i2 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i = view.getMeasuredWidth();
            i2 = view.getMeasuredHeight();
        }
        ylb ylbVar = this.y;
        Drawable drawable = ylbVar != null ? ylbVar.getDrawable("drawableMsgInMedia") : null;
        if (drawable == null) {
            drawable = cmb.P0("drawableMsgInMedia");
        }
        m37 m37Var = (m37) drawable;
        m37Var.o((int) getY(), i, i2);
        m37Var.setBounds(width, 0, this.e + width, this.f);
        m37Var.draw(canvas);
        fg0 fg0Var = this.K;
        if (fg0Var != null) {
            int i3 = this.L;
            int i4 = gda.U0;
            if (i3 != i4) {
                this.L = i4;
                cmb.E1(fg0Var, i4, i4);
            }
            fg0Var.setBounds(gm.L(2.0f) + width, gm.L(2.0f), (this.e + width) - gm.L(2.0f), this.f - gm.L(2.0f));
            fg0Var.draw(canvas);
        }
        int i5 = this.I;
        float f = width + i5;
        float f2 = i5;
        float f3 = this.e - (i5 << 1);
        float f4 = this.E - i5;
        ImageReceiver imageReceiver = this.F;
        imageReceiver.i0(f, f2, f3, f4);
        imageReceiver.h(canvas, null);
        cmb.n2.setColor(cmb.v0(cmb.Uc, ylbVar));
        cmb.n2.linkColor = cmb.v0(cmb.Wc, ylbVar);
        canvas.save();
        int L2 = gm.L(this.G ? 14.0f : 11.0f) + width;
        this.h = L2;
        float f5 = L2;
        int L3 = gm.L(11.0f) + L;
        this.n = L3;
        canvas.translate(f5, L3);
        if (this.s.g(canvas)) {
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
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), gm.L(8.0f) + this.f);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        fg0 fg0Var;
        cr0 cr0Var;
        boolean z2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.a != null) {
            if (motionEvent.getAction() == 0 || (this.r != null && motionEvent.getAction() == 1)) {
                if (motionEvent.getAction() == 0) {
                    a();
                    try {
                        int i = (int) (y - this.n);
                        int lineForVertical = this.a.getLineForVertical(i);
                        float f = (int) (x - this.h);
                        int offsetForHorizontal = this.a.getOffsetForHorizontal(lineForVertical, f);
                        float lineLeft = this.a.getLineLeft(lineForVertical);
                        if (lineLeft > f || lineLeft + this.a.getLineWidth(lineForVertical) < f) {
                            a();
                        } else {
                            Spannable spannable = (Spannable) this.a.getText();
                            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                            if (clickableSpanArr.length != 0) {
                                a();
                                this.r = new m66(clickableSpanArr[0], this.y, f, i, 0);
                                try {
                                    try {
                                        int spanStart = spannable.getSpanStart(clickableSpanArr[0]);
                                        b66 b = this.r.b();
                                        b.d(this.a, spanStart, 0.0f);
                                        this.a.getSelectionPath(spanStart, spannable.getSpanEnd(clickableSpanArr[0]), b);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                    this.s.a(this.r, null);
                                    invalidate();
                                    z = true;
                                } catch (Exception e2) {
                                    e = e2;
                                    z2 = true;
                                    a();
                                    fc4.g(e, true);
                                    z = z2;
                                    fg0Var = this.K;
                                    if (fg0Var != null) {
                                    }
                                    if (z) {
                                    }
                                }
                            } else {
                                a();
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z2 = false;
                    }
                } else {
                    m66 m66Var = this.r;
                    if (m66Var != null) {
                        try {
                            ClickableSpan clickableSpan = (ClickableSpan) m66Var.i;
                            if (clickableSpan instanceof g6c) {
                                String url = ((g6c) clickableSpan).getURL();
                                if ((url.startsWith("@") || url.startsWith("#") || url.startsWith("/") || url.startsWith("$")) && (cr0Var = this.w) != null) {
                                    ((cd1) cr0Var).f(url);
                                }
                            } else if (clickableSpan instanceof URLSpan) {
                                cr0 cr0Var2 = this.w;
                                if (cr0Var2 != null) {
                                    ((cd1) cr0Var2).f(((URLSpan) clickableSpan).getURL());
                                }
                            } else if (clickableSpan != null) {
                                clickableSpan.onClick(this);
                            }
                        } catch (Exception e4) {
                            fc4.g(e4, true);
                        }
                        a();
                        z = true;
                    }
                }
                fg0Var = this.K;
                if (fg0Var != null) {
                    if (!z && y > 0.0f && motionEvent.getAction() == 0 && isClickable()) {
                        fg0Var.setState(new int[]{R.attr.state_pressed, R.attr.state_enabled});
                        fg0Var.setHotspot(motionEvent.getX(), motionEvent.getY());
                        invalidate();
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        fg0Var.setState(new int[0]);
                        invalidate();
                        if (!z && motionEvent.getAction() == 1) {
                            performClick();
                        }
                    }
                    z = true;
                }
                return !z || super.onTouchEvent(motionEvent);
            }
            if (motionEvent.getAction() == 3) {
                a();
            }
        }
        z = false;
        fg0Var = this.K;
        if (fg0Var != null) {
        }
        if (z) {
            return true;
        }
    }

    public void setAnimating(boolean z) {
        this.J = z;
    }

    public void setDelegate(cr0 cr0Var) {
        this.w = cr0Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.K || super.verifyDrawable(drawable);
    }
}
