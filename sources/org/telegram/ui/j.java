package org.telegram.ui;

import android.app.Activity;
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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class j extends FrameLayout implements zlb {
    public final i a;
    public final hyc b;
    public cw c;
    public cw d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed w;
    public final ex x;
    public final /* synthetic */ o y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, Activity activity, ex exVar) {
        super(activity);
        this.y = oVar;
        this.x = exVar;
        byte b = 0;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        hyc hycVar = new hyc(activity, false, new ru(this));
        this.b = hycVar;
        addView(hycVar);
        oVar.O.add(this);
        i iVar = new i(this, activity);
        this.a = iVar;
        iVar.getSettings().setJavaScriptEnabled(true);
        iVar.getSettings().setDomStorageEnabled(true);
        iVar.getSettings().setAllowContentAccess(true);
        iVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
        iVar.addJavascriptInterface(new ArticleViewer$BlockEmbedCell$TelegramWebviewProxy(this), "TelegramWebviewProxy");
        iVar.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(iVar, true);
        iVar.setWebChromeClient(new su(this, b));
        iVar.setWebViewClient(new tu(this, b));
        addView(iVar);
    }

    public final void a(boolean z) {
        i iVar = this.a;
        if (iVar != null) {
            try {
                iVar.stopLoading();
                iVar.loadUrl("about:blank");
                if (z) {
                    iVar.destroy();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        this.w = null;
        hyc hycVar = this.b;
        if (hycVar != null) {
            hycVar.b();
        }
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            arrayList.add(cwVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.y.W) {
            this.w = null;
        }
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
        }
        cw cwVar2 = this.d;
        if (cwVar2 != null) {
            cwVar2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w != null) {
            cw cwVar = this.c;
            o oVar = this.y;
            int i = 0;
            if (cwVar != null) {
                canvas.save();
                canvas.translate(this.e, this.f);
                o.s(oVar, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.e, this.f + this.h);
                o.s(oVar, canvas, this, i);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(ob6.M0(2131754863, null));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i iVar = this.a;
        if (iVar != null) {
            int i5 = this.n;
            iVar.layout(i5, 0, iVar.getMeasuredWidth() + i5, iVar.getMeasuredHeight());
        }
        hyc hycVar = this.b;
        if (hycVar == null || hycVar.getParent() != this) {
            return;
        }
        int i6 = this.n;
        hycVar.layout(i6, 0, hycVar.getMeasuredWidth() + i6, hycVar.getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        j jVar;
        int i3;
        int i4;
        int i5;
        int i6;
        int L;
        cw cwVar;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockEmbed pageblockembed = this.w;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int L2 = hl.L(18.0f) + hl.L(r15 * 14);
                this.n = L2;
                this.e = L2;
                i4 = ik8.B(18.0f, L2, size);
                i5 = i4;
            } else {
                this.n = 0;
                this.e = hl.L(18.0f);
                int L3 = size - hl.L(36.0f);
                if (this.w.full_width) {
                    i4 = size;
                } else {
                    i4 = size - hl.L(36.0f);
                    this.n = hl.L(18.0f) + this.n;
                }
                i5 = L3;
            }
            TL_iv.pageBlockEmbed pageblockembed2 = this.w;
            int i7 = pageblockembed2.w;
            float f = i7 == 0 ? 1.0f : size / i7;
            int i8 = this.r;
            if (i8 != 0) {
                i6 = hl.L(i8);
            } else {
                float f2 = pageblockembed2.h;
                if (i7 == 0) {
                    f2 = hl.L(f2);
                }
                i6 = (int) (f2 * f);
            }
            if (i6 == 0) {
                i6 = hl.L(10.0f);
            }
            int i9 = i6;
            i iVar = this.a;
            if (iVar != null) {
                iVar.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30));
            }
            hyc hycVar = this.b;
            if (hycVar != null && hycVar.getParent() == this) {
                hycVar.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(10.0f) + i9, TLObject.FLAG_30));
            }
            int L4 = hl.L(8.0f) + i9;
            this.f = L4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.w;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = o.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            o oVar = this.y;
            jVar = this;
            cw n = o.n(oVar, jVar, null, richText, i5, L4, pageblockembed3, alignment, 0, this.x);
            jVar.c = n;
            if (n != null) {
                int height = jVar.c.d.getHeight() + hl.L(4.0f);
                jVar.h = height;
                i9 = uh9.w(4.0f, height, i9);
            } else {
                jVar.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = jVar.w;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (jVar.x.H) {
                alignment = o0b.a();
            }
            cw n2 = o.n(oVar, jVar, null, richText2, i5, 0, pageblockembed4, alignment, 0, jVar.x);
            jVar.d = n2;
            if (n2 != null) {
                i9 += jVar.d.d.getHeight() + hl.L(4.0f);
                cw cwVar2 = jVar.d;
                cwVar2.s = jVar.e;
                cwVar2.w = jVar.h;
            }
            i3 = hl.L(5.0f) + i9;
            TL_iv.pageBlockEmbed pageblockembed5 = jVar.w;
            int i10 = pageblockembed5.level;
            if (i10 <= 0 || pageblockembed5.bottom) {
                if (i10 == 0 && jVar.c != null) {
                    L = hl.L(8.0f);
                }
                cwVar = jVar.c;
                if (cwVar != null) {
                    cwVar.s = jVar.e;
                    cwVar.w = jVar.f;
                }
            } else {
                L = hl.L(8.0f);
            }
            i3 += L;
            cwVar = jVar.c;
            if (cwVar != null) {
            }
        } else {
            jVar = this;
            i3 = 1;
        }
        jVar.setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cw cwVar = this.c;
        int i = this.e;
        int i2 = this.f;
        o oVar = this.y;
        if (o.i(oVar, this.x, motionEvent, this, cwVar, i, i2)) {
            return true;
        }
        return o.i(oVar, this.x, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
