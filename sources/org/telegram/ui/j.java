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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j extends FrameLayout implements fkb {
    public final i a;
    public final tvc b;
    public bx c;
    public bx d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public boolean s;
    public TL_iv.pageBlockEmbed w;
    public final ey x;
    public final /* synthetic */ o y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(o oVar, Activity activity, ey eyVar) {
        super(activity);
        this.y = oVar;
        this.x = eyVar;
        byte b = 0;
        setWillNotDraw(false);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.b = null;
            this.a = null;
            return;
        }
        tvc tvcVar = new tvc(activity, false, new qv(this));
        this.b = tvcVar;
        addView(tvcVar);
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
        iVar.setWebChromeClient(new rv(this, b));
        iVar.setWebViewClient(new sv(this, b));
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
                fc4.g(e, true);
            }
        }
        this.w = null;
        tvc tvcVar = this.b;
        if (tvcVar != null) {
            tvcVar.b();
        }
    }

    @Override // fkb
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (!this.y.W) {
            this.w = null;
        }
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.f(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.w != null) {
            bx bxVar = this.c;
            o oVar = this.y;
            int i = 0;
            if (bxVar != null) {
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
        StringBuilder sb = new StringBuilder(jb6.M0(2131754867, null));
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
        tvc tvcVar = this.b;
        if (tvcVar == null || tvcVar.getParent() != this) {
            return;
        }
        int i6 = this.n;
        tvcVar.layout(i6, 0, tvcVar.getMeasuredWidth() + i6, tvcVar.getMeasuredHeight());
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
        bx bxVar;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockEmbed pageblockembed = this.w;
        if (pageblockembed != null) {
            if (pageblockembed.level > 0) {
                int L2 = gm.L(18.0f) + gm.L(r15 * 14);
                this.n = L2;
                this.e = L2;
                i4 = wi8.B(18.0f, L2, size);
                i5 = i4;
            } else {
                this.n = 0;
                this.e = gm.L(18.0f);
                int L3 = size - gm.L(36.0f);
                if (this.w.full_width) {
                    i4 = size;
                } else {
                    i4 = size - gm.L(36.0f);
                    this.n = gm.L(18.0f) + this.n;
                }
                i5 = L3;
            }
            TL_iv.pageBlockEmbed pageblockembed2 = this.w;
            int i7 = pageblockembed2.w;
            float f = i7 == 0 ? 1.0f : size / i7;
            int i8 = this.r;
            if (i8 != 0) {
                i6 = gm.L(i8);
            } else {
                float f2 = pageblockembed2.h;
                if (i7 == 0) {
                    f2 = gm.L(f2);
                }
                i6 = (int) (f2 * f);
            }
            if (i6 == 0) {
                i6 = gm.L(10.0f);
            }
            int i9 = i6;
            i iVar = this.a;
            if (iVar != null) {
                iVar.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i9, TLObject.FLAG_30));
            }
            tvc tvcVar = this.b;
            if (tvcVar != null && tvcVar.getParent() == this) {
                tvcVar.measure(View.MeasureSpec.makeMeasureSpec(i4, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(10.0f) + i9, TLObject.FLAG_30));
            }
            int L4 = gm.L(8.0f) + i9;
            this.f = L4;
            TL_iv.pageBlockEmbed pageblockembed3 = this.w;
            TL_iv.RichText richText = pageblockembed3.caption.text;
            HashSet hashSet = o.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            o oVar = this.y;
            jVar = this;
            bx n = o.n(oVar, jVar, null, richText, i5, L4, pageblockembed3, alignment, 0, this.x);
            jVar.c = n;
            if (n != null) {
                int height = jVar.c.d.getHeight() + gm.L(4.0f);
                jVar.h = height;
                i9 = hg9.v(4.0f, height, i9);
            } else {
                jVar.h = 0;
            }
            TL_iv.pageBlockEmbed pageblockembed4 = jVar.w;
            TL_iv.RichText richText2 = pageblockembed4.caption.credit;
            if (jVar.x.H) {
                alignment = oya.a();
            }
            bx n2 = o.n(oVar, jVar, null, richText2, i5, 0, pageblockembed4, alignment, 0, jVar.x);
            jVar.d = n2;
            if (n2 != null) {
                i9 += jVar.d.d.getHeight() + gm.L(4.0f);
                bx bxVar2 = jVar.d;
                bxVar2.s = jVar.e;
                bxVar2.w = jVar.h;
            }
            i3 = gm.L(5.0f) + i9;
            TL_iv.pageBlockEmbed pageblockembed5 = jVar.w;
            int i10 = pageblockembed5.level;
            if (i10 <= 0 || pageblockembed5.bottom) {
                if (i10 == 0 && jVar.c != null) {
                    L = gm.L(8.0f);
                }
                bxVar = jVar.c;
                if (bxVar != null) {
                    bxVar.s = jVar.e;
                    bxVar.w = jVar.f;
                }
            } else {
                L = gm.L(8.0f);
            }
            i3 += L;
            bxVar = jVar.c;
            if (bxVar != null) {
            }
        } else {
            jVar = this;
            i3 = 1;
        }
        jVar.setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bx bxVar = this.c;
        int i = this.e;
        int i2 = this.f;
        o oVar = this.y;
        if (o.i(oVar, this.x, motionEvent, this, bxVar, i, i2)) {
            return true;
        }
        return o.i(oVar, this.x, motionEvent, this, this.d, this.e, this.f + this.h) || super.onTouchEvent(motionEvent);
    }
}
