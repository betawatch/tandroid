package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q1 extends FrameLayout implements org.telegram.ui.Cells.h9 {
    public final p1 a;
    public final org.telegram.ui.Components.m71 b;
    public z2 c;
    public z2 d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed w;
    public final e4 x;
    public final /* synthetic */ g4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(g4 g4Var, Context context, e4 e4Var) {
        super(context);
        this.y = g4Var;
        this.x = e4Var;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        org.telegram.ui.Components.m71 m71Var = new org.telegram.ui.Components.m71(context, false, new l1(this));
        this.b = m71Var;
        addView(m71Var);
        g4Var.N.add(this);
        p1 p1Var = new p1(this, context);
        this.a = p1Var;
        p1Var.getSettings().setJavaScriptEnabled(true);
        p1Var.getSettings().setDomStorageEnabled(true);
        p1Var.getSettings().setAllowContentAccess(true);
        p1Var.getSettings().setMediaPlaybackRequiresUserGesture(false);
        p1Var.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
        p1Var.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(p1Var, true);
        int i7 = 0;
        p1Var.setWebChromeClient(new m1(this, i7));
        p1Var.setWebViewClient(new n1(this, i7));
        addView(p1Var);
    }

    public final void a(boolean z9) {
        p1 p1Var = this.a;
        if (p1Var != null) {
            try {
                p1Var.stopLoading();
                p1Var.loadUrl("about:blank");
                if (z9) {
                    p1Var.destroy();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.w = null;
        org.telegram.ui.Components.m71 m71Var = this.b;
        if (m71Var != null) {
            m71Var.b();
        }
    }

    @Override // org.telegram.ui.Cells.h9
    public final void k(ArrayList arrayList) {
        z2 z2Var = this.c;
        if (z2Var != null) {
            arrayList.add(z2Var);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            arrayList.add(z2Var2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.i(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.y.V) {
            this.w = null;
        }
        z2 z2Var = this.c;
        if (z2Var != null) {
            z2Var.f(this);
        }
        z2 z2Var2 = this.d;
        if (z2Var2 != null) {
            z2Var2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w == null) {
            return;
        }
        z2 z2Var = this.c;
        g4 g4Var = this.y;
        int i7 = 0;
        if (z2Var != null) {
            canvas.save();
            canvas.translate(this.e, this.f);
            g4.t(g4Var, canvas, this, 0);
            this.c.d(canvas, this);
            canvas.restore();
            i7 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.e, this.f + this.h);
            g4.t(g4Var, canvas, this, i7);
            this.d.d(canvas, this);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(org.telegram.messenger.id.M0(2131754868, null));
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb2.append(", ");
            sb2.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        p1 p1Var = this.a;
        if (p1Var != null) {
            int i13 = this.n;
            p1Var.layout(i13, 0, p1Var.getMeasuredWidth() + i13, p1Var.getMeasuredHeight());
        }
        org.telegram.ui.Components.m71 m71Var = this.b;
        if (m71Var == null || m71Var.getParent() != this) {
            return;
        }
        int i14 = this.n;
        m71Var.layout(i14, 0, m71Var.getMeasuredWidth() + i14, m71Var.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int L;
        z2 z2Var;
        int size = View.MeasureSpec.getSize(i7);
        TL_iv.pageBlockEmbed pageblockembed = this.w;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int L2 = org.telegram.messenger.g0.L(18.0f) + org.telegram.messenger.g0.L(r15 * 14);
                this.n = L2;
                this.e = L2;
                i12 = org.telegram.messenger.camera.q.w(18.0f, L2, size);
                i13 = i12;
            } else {
                this.n = 0;
                this.e = org.telegram.messenger.g0.L(18.0f);
                int L3 = size - org.telegram.messenger.g0.L(36.0f);
                if (this.w.full_width) {
                    i12 = size;
                } else {
                    i12 = size - org.telegram.messenger.g0.L(36.0f);
                    this.n = org.telegram.messenger.g0.L(18.0f) + this.n;
                }
                i13 = L3;
            }
            TL_iv.pageBlockEmbed pageblockembed2 = this.w;
            int i15 = pageblockembed2.w;
            float f10 = i15 == 0 ? 1.0f : size / i15;
            int i16 = this.r;
            if (i16 != 0) {
                i14 = org.telegram.messenger.g0.L(i16);
            } else {
                float f11 = pageblockembed2.h;
                if (i15 == 0) {
                    f11 = org.telegram.messenger.g0.L(f11);
                }
                i14 = (int) (f11 * f10);
            }
            if (i14 == 0) {
                i14 = org.telegram.messenger.g0.L(10.0f);
            }
            int i17 = i14;
            p1 p1Var = this.a;
            if (p1Var != null) {
                p1Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i17, TLObject.FLAG_30));
            }
            org.telegram.ui.Components.m71 m71Var = this.b;
            if (m71Var != null && m71Var.getParent() == this) {
                m71Var.measure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(10.0f) + i17, TLObject.FLAG_30));
            }
            int L4 = org.telegram.messenger.g0.L(8.0f) + i17;
            this.f = L4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.w;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = g4.c1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            g4 g4Var = this.y;
            z2 n10 = g4.n(g4Var, this, null, richText, i13, L4, pageblockembed3, alignment, 0, this.x);
            this.c = n10;
            if (n10 != null) {
                int height = this.c.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                this.h = height;
                i17 = org.telegram.messenger.k5.C(4.0f, height, i17);
            } else {
                this.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = this.w;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (this.x.G) {
                alignment = org.telegram.ui.Components.ou0.a();
            }
            z2 n11 = g4.n(g4Var, this, null, richText2, i13, 0, pageblockembed4, alignment, 0, this.x);
            this.d = n11;
            if (n11 != null) {
                i17 += this.d.d.getHeight() + org.telegram.messenger.g0.L(4.0f);
                z2 z2Var2 = this.d;
                z2Var2.s = this.e;
                z2Var2.w = this.h;
            }
            i11 = org.telegram.messenger.g0.L(5.0f) + i17;
            TL_iv.pageBlockEmbed pageblockembed5 = this.w;
            int i18 = pageblockembed5.level;
            if (i18 <= 0 || pageblockembed5.bottom) {
                if (i18 == 0 && this.c != null) {
                    L = org.telegram.messenger.g0.L(8.0f);
                }
                z2Var = this.c;
                if (z2Var != null) {
                    z2Var.s = this.e;
                    z2Var.w = this.f;
                }
            } else {
                L = org.telegram.messenger.g0.L(8.0f);
            }
            i11 += L;
            z2Var = this.c;
            if (z2Var != null) {
            }
        } else {
            i11 = 1;
        }
        setMeasuredDimension(size, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        z2 z2Var = this.c;
        int i7 = this.e;
        int i10 = this.f;
        g4 g4Var = this.y;
        if (g4.j(g4Var, this.x, motionEvent, this, z2Var, i7, i10)) {
            return true;
        }
        return g4.j(g4Var, this.x, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
